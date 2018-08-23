import java.util.*;
import java.io.*;
public class Main
{
    static int fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
       return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int total_people=sc.nextInt();
        int possibility=sc.nextInt();
        int output=0;
        System.out.print("ENTER 1.Combination 2.Permutation\n");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                if(total_people>possibility)
                output=fact(total_people)/(fact(possibility) * fact(total_people-possibility)) ;
                else
                {
                    int temp=total_people;
                    total_people=possibility;
                    possibility=temp;
                    output=fact(total_people)/(fact(possibility) * fact(total_people-possibility)) ;
                }
            break;
            case 2:
                if(total_people>possibility)
                output=fact(total_people)/( fact(total_people-possibility)) ;
                else
                {
                    int temp=total_people;
                    total_people=possibility;
                    possibility=temp;
                    output=fact(total_people)/( fact(total_people-possibility)) ;
            
                }
            break;
        }
        System.out.print(output);
    }
}
