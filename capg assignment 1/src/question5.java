import java.util.Scanner;
public class question5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ctc");
		int n=sc.nextInt();
		if(n<=180000) {
			System.out.println("TAX is 0 or Nil" );
		}
		else if(n<=300000){
			System.out.println("TAX is " + n*0.1 + " Total Amount left is "+ (n-n*0.1));
		}
		else if(n<=500000){
			System.out.println("TAX is " + n*0.2 + " Total Amount left is "+ (n-n*0.2));
		}
		else if(n<=1000000){
			System.out.println("TAX is " + n*0.3 + " Total Amount left is "+ (n-n*0.3));
		}
		else {
			System.out.println("Go for blacck money");
		}
		
	}
}
