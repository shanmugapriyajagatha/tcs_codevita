import java.io.*;
import java.util.*;
public class Main
{
public static void main (String[] args) 
{
   Scanner sc=new Scanner(System.in);
   int arr_size=sc.nextInt();
   int[] arr=new int[arr_size];
   for(int i=0;i<arr_size;i++)
   {
       arr[i]=sc.nextInt();
   }
   int k=sc.nextInt();
   int total=0;
   for(int i=0;i<arr_size;i++)
   {
       total=total^arr[i];
   }
   int find=total^k;
   System.out.print(find);
}
}
