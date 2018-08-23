import java.util.*;
public class GCD {

    public static int gcd(int[] numbers) {
        int gcd=1;
        int index=2;
        if(numbers.length==1){
            gcd=numbers[1];
        }
        if(numbers.length>1){
           gcd=euclidGcd(numbers[0],numbers[1]); 
        }
        while(index<numbers.length){
            gcd=euclidGcd(gcd,numbers[index]);
            index++;
        }
        return gcd;
    }
    public static int euclidGcd(int num1,int num2){
        int temp=0;
        while(num2!=0){
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        num1=num1<0 ? num1 * (-1):num1;
        return num1;
    }
    public static void main(String[] args) {
        int[] numbers = {140,72,130};
        System.out.println(gcd(numbers));
    }
}
