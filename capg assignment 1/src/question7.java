
import java.util.*;
public class question7 {
	

	    // Function return true if given element
	    // found in array
	    
	 
	    public static void main(String[] args)
	    {
	 
	    	Scanner sc=new Scanner(System.in);
	        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };
	        int Value=sc.nextInt();
	        boolean test=false;
	        for (int element : arr) {
	            if (element == Value) {
	                test = true;
	                break;
	            }
	        }
	        System.out.println("Is " + Value+ " present in the array: " + test);
	    }
	}


