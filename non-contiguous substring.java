import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String tobefound=sc.nextLine();
    int count=0;
    char[] ch=str.toCharArray();
    char[] ch_found=tobefound.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch_found);
    for(int i=0;i<ch_found.length;i++)
    {
      for(int j=0;j<ch.length;j++)
      {
        //count;
        if(ch_found[i]==ch[j])
        {
          count++;
          break;
        }
      }
    }
    if(count==ch_found.length)
      System.out.print("Word found in sentence");
    else
      System.out.print("Word not found in sentence");
      
  }
}
