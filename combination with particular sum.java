import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int arr_size=sc.nextInt();
    int[] arr=new int[arr_size];
    int sum=0;
    for(int i=0;i<arr_size;i++)
    {
      arr[i]=sc.nextInt();
    }
    int sum_finder=sc.nextInt();
    Arrays.sort(arr);
    for(int i=0;i<arr_size;i++)
    {
      sum+=arr[i];
      if(sum>=sum_finder)
      {
       	//System.out.print(sum);
      	break;
      }
    }
    if(sum>sum_finder)
    {
      for(int j=0;j<arr_size;j++)
      {
        sum-=arr[j];
        if(sum==sum_finder)
        {
          break;
        }
      }
    }
    if(sum==sum_finder)
      System.out.println("Combination Found = 1");
    else
      System.out.println("Combination Found = 0");
  }
}
