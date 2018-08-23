import java.io.*;
import java.util.*;
public class Main
{
public static void main (String[] args) 
{
   Scanner sc=new Scanner(System.in);
   int x1=sc.nextInt();
   int y1=sc.nextInt();
   int x2=sc.nextInt();
   int y2=sc.nextInt();
   int x=sc.nextInt();
   int slope=(y2-y1)/(x2-x1);
   int constant=(y1-slope*x1);
   int out=slope*x+constant;
   System.out.print(out);
}
}
