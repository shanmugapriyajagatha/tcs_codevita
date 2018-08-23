#include <stdio.h>

#define MAX_HOUSES 50

#define MAX(a, b) (a>b) ? a : b

int max_stealing_wrapper(int house_values[], int n)
{
	int even=0,odd=0;
  	int i=0;
  for(i=0;i<n;i++)
  {
    if(i%2==0)
      even+=house_values[i];
    else
      odd+=house_values[i];
  }
 if(even>odd)
   return even;
 else
   return odd;
}

int main() {
	//code
	int n, house_values[MAX_HOUSES], i;
	
	// Total houses
	scanf("%d", &n);
	
	// Values at each house
	for(i = 0; i < n; i++)
	{
	    scanf("%d", &house_values[i]);
	}
	
	printf("%d", max_stealing_wrapper(house_values, n));
	return 0;
}
