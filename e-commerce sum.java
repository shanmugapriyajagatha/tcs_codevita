import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
  	Scanner read=new Scanner(System.in);
    String st="";
    int sum=0;
    for(int i=0;read.hasNext()==true;i++)
    {
      st=read.nextLine();
      String arr[]=st.split(",");
      sum=sum+Integer.parseInt(arr[1]);
    }
  System.out.print(sum);
  }
}
