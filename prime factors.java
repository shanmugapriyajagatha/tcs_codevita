import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
       for(int i=2;i<=Math.sqrt(b);i++)
       while(b%i==0)
       {
           System.out.print(i+" ");
           b=b/i;
       }
    }
}
