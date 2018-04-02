import java.util.Scanner;
import java.util.Arrays;

public class OptimizeBurger {
	
	public static void main(String args[]){
		
		int minErr = 0, d=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of ingredients you want between your two burger buns");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter each ingredient's optimal distance-to-bun value");
		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
        
			minErr+=Math.pow((double)arr[i]-d, 2);
            if(i%2==1){
                d++;
           }
        }		
		System.out.println("Minimum Error: "+minErr);
		sc.close();
	}	
}