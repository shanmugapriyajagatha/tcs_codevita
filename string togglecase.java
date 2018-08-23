import java.util.*;
import java.io.*;
public class Shanmu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is a nice day";
		String si,di,d1,d2,output="";
		int a=41,m,n;
		m=a%10;
		n=a/10;
		int b[]= {m,n};
		String s1[]=s.split(" ");
		for(int ctr=0;ctr<b.length;ctr++)
		{
			String o=s1[b[ctr]-1];
			int l=o.length()/2;
			if(o.length()%2==0)
			{
				d1=o.substring(0,l);
				si=new StringBuffer(d1).reverse().toString();
				di=o.substring(l,o.length());
			}
			else
			{
				d2=o.substring(0,l+1);
				di=new StringBuffer(d2).reverse().toString();
				si=o.substring(l,o.length());
			}
			//System.out.println(si + " "+ di);
			output=output+di+si+" ";
			System.out.println(output.trim());
		}
		}
}
