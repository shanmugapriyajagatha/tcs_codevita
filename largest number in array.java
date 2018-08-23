import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int ctr=0;ctr<n;ctr++)
        {
            arr[ctr]=sc.nextInt();
        }
         int count=0,swap=0,i=0,j=0;
            for (i = 0; i < arr.length; i++)
            {
            for (j = 0; j < arr.length- 1; j++)
            {
            if (arr[j] > arr[j + 1]) 
            {
            swap=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=swap;
            count++;
            }
                
             }
         }
       // System.out.println("Array is sorted in "+count+" swaps.");
        //System.out.println("First Element: "+arr[0]);
        System.out.println("Largest Element: "+arr[j]);
  }
}
