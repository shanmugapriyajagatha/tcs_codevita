import java.util.Arrays;
import java.util.Scanner;


public class DecreasingSequence {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s[]=new int[n];
		for(int l=0;l<n;l++)
		{
			a[l]=sc.nextInt();
		}
		int i,j=0;
		int k=0;
		int count=1;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
					count++;
					}
				else
				{
					count=1;
					k=k+1;
					break;
				}
				if(count>=2)
				{
					s[k]=count;
				
					break;
				}
				
			}
		}
		
		int seqcount=0;
		int maxcount=0;
		
		for(int m=0;m<n;m++)
		{
		
			if(s[m]>0)
			{
				seqcount++;
				
			}
		}
		System.out.println(seqcount);
		
		Arrays.sort(s);
	    int length=s.length;
		maxcount=s[length-1];
		System.out.println(maxcount);

	}

}
