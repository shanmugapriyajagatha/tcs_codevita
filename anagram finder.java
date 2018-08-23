import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    char[] ch1=str1.toCharArray();
    char[] ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    int count=0;
   for(int i=0;i<ch1.length;i++)
     for(int j=0;j<ch2.length;j++)
     {	
       count=0;
       if(ch1[i]==ch2[j])
         count++;
      }
    if(count==1)
      System.out.print("Anagram");
    else
      System.out.print("Not an Anagram");
  }
}
