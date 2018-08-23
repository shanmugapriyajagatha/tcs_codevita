#include <stdio.h>

#define MAX_SIZE 50
#define MAX_KNAPSACK_CAPACITY_VALUE 300

#define max(a, b) a > b ? a : b

// Without memoization
int get_max_ks_val(int val[MAX_SIZE], 
				     int wgts[MAX_SIZE],
					 int n,
					 int knapsack_max_capacity,
					 int curr_item_idx,
					 int curr_wgt)
{	
	if(curr_item_idx >= n)
	{
		return 0;
	}
	
	int val_if_taken = 0, val_if_not_taken = 0;
	
	int wgt_if_taken = curr_wgt + wgts[curr_item_idx];
	int wgt_if_not_taken = curr_wgt;
	if(wgt_if_taken <= knapsack_max_capacity)
	{
		val_if_taken = val[curr_item_idx] + 
					   get_max_ks_val(val, wgts, n, knapsack_max_capacity, 
						    		  curr_item_idx + 1,
						 			  wgt_if_taken);
	}
	
	val_if_not_taken = get_max_ks_val(val, wgts, n, knapsack_max_capacity, 
							  	      curr_item_idx + 1,
								      wgt_if_not_taken);
	
	
	return max(val_if_taken, val_if_not_taken);
}

// Without memoization wrapper
int get_max_ks_val_wrapper(int val[MAX_SIZE], 
						     int wgts[MAX_SIZE], 
							 int n,
							 int knapsack_max_capacity)
{
	return get_max_ks_val(val, 
						    wgts, 
							n,
							knapsack_max_capacity,
							0 /* Current Item Index*/,
							0 /* Current Weight */);
}

// With memoization
int get_max_ks_val_with_memoi(int val[MAX_SIZE], 
				     int wgts[MAX_SIZE],
					 int n,
					 int knapsack_max_capacity,
					 int curr_item_idx,
					 int curr_wgt,
					 int results_cache[][knapsack_max_capacity + 1])
{	
	if(curr_item_idx >= n)
	{
		return 0;
	}
	
	if(results_cache[curr_item_idx][curr_wgt] != -1)
	{
		return results_cache[curr_item_idx][curr_wgt];
	}
	
	int val_if_taken = 0, val_if_not_taken = 0;
	
	int wgt_if_taken = curr_wgt + wgts[curr_item_idx];
	int wgt_if_not_taken = curr_wgt;
	if(wgt_if_taken <= knapsack_max_capacity)
	{
		val_if_taken = val[curr_item_idx] + 
					   get_max_ks_val_with_memoi(val, wgts, n, knapsack_max_capacity, 
						    		  curr_item_idx + 1,
						 			  wgt_if_taken,
									  results_cache);
	}
	
	val_if_not_taken = get_max_ks_val_with_memoi(val, wgts, n, knapsack_max_capacity, 
							  	      curr_item_idx + 1,
								      wgt_if_not_taken,
									  results_cache);
	
	
	results_cache[curr_item_idx][curr_wgt] = max(val_if_taken, val_if_not_taken);
	return results_cache[curr_item_idx][curr_wgt];
}

// With memoization wrapper
int get_max_ks_val_with_memoi_wrapper(int val[MAX_SIZE], 
						     int wgts[MAX_SIZE], 
							 int n,
							 int knapsack_max_capacity)
{
    int i,j;
	int results_cache[n][knapsack_max_capacity + 1];
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < (knapsack_max_capacity + 1); j++)
		{
			results_cache[i][j] = -1;
		}
	}
	
	return get_max_ks_val_with_memoi(val, 
						    wgts, 
							n,
							knapsack_max_capacity,
							0 /* Current Item Index*/,
							0 /* Current Weight */,
							results_cache);
}

int main() {
	//code
	int W, wgts[MAX_SIZE], val[MAX_SIZE], i, n;
	
	scanf("%d", &n);
	for(i = 0; i < n; i++)
	{
	    scanf("%d", &wgts[i]);
		scanf("%d", &val[i]);
	}
	
	scanf("%d", &W);
	
	printf("%d", get_max_ks_val_with_memoi_wrapper(val, wgts, n, W));
	return 0;
}
