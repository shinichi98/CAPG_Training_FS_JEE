import java.util.*;
public class question1 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to check");
		int n=sc.nextInt();
		int k=n;
		int result=0;
		while(k!=0) {
			int m=k%10;
			result+=m*m*m;
			k/=10;
		}
		if(n==result) {
			System.out.println("armstrong no.");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}
}
