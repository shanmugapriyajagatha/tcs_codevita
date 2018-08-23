import java.util.*;
public class LcmArray{
		public static Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
		System.out.println("Enter length of array : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		getArray(arr,n);
		calcLcm(arr);
	}
	public static void getArray(int array[], int n){
		for(int i=0;i<n; i++){
			array[i] = sc.nextInt();
		}
	}

	public static void calcLcm(int array[]){
		int min,x,max,lcm =0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length-1;j++){
				
				if(array[i]>array[j]){
					min = array[j];
					max= array[i];
				}
				else {
					min= array[i];
					max=array[j];
				}
				for(int k =0;k<array.length;k++){
					x = k * max;
					if(x% min ==0){
						lcm =x ;
					}
				}
			}
		}
		System.out.println("LCM of the given array of numbers : " + lcm);
	}
}
