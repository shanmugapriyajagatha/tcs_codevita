#include <stdio.h>

int total_ways_wrapper(int m, int n)
{
    if(m==1||n==1)
       return 1;
    return total_ways_wrapper(m-1,n)+total_ways_wrapper(m,n-1);
}

int main() {
	//code
	int m,n;
	scanf("%d %d", &m, &n);
	
	printf("%d",total_ways_wrapper(m,n));
	return 0;
}
