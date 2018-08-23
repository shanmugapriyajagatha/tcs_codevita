import java.io.*;
import java.util.*;
public class Main
{
public static void main (String[] args) 
{
   Scanner sc=new Scanner(System.in);
   float x1=sc.nextInt();
   float y1=sc.nextInt();
   float x2=sc.nextInt();
   float y2=sc.nextInt();
   float x3=sc.nextInt();
   float y3=sc.nextInt();
   float x4=sc.nextInt();
   float y4=sc.nextInt();
   float slope1=(y2-y1)/(x2-x1);
   //System.out.println(slope);
   float slope2=(y4-y3)/(x4-x3);
   //System.out.println(slope1);
   float c1=(y1-slope1*x1);
   //System.out.println(c1);
   float c2=(y3-slope2*x3);
   //System.out.println(c2);
   float x=0;
   x=(c2-c1)/(slope1-slope2);
   float out=(slope1*x)+c1;
   float out1=(slope2*x)+c2;
   String s1 = String.format("%.2f", x);
   String s2 = String.format("%.2f", out);
   System.out.println(s1);
   System.out.println(s2);
}
}
