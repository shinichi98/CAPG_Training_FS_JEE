import java.util.*;
public class question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("SELECT C FOR COMPOUND INTEREST AND S FOR SIMPLE INTEREST");
		char a=sc.next().charAt(0);
		System.out.println("Enter principle amount");
		int p=sc.nextInt();
		System.out.println("Enter rate of interest");
		int r=sc.nextInt();
		System.out.println("Enter time frame");
		int t=sc.nextInt();
		System.out.println("Enter no. of times interest to be applied");
		int n=sc.nextInt();
		double answer;
		switch(a) {
		case 'C':answer=p*(Math.pow((1+(r/n)),n*t));
				 System.out.println("Answer is "+ answer);
				 break;
		case 'S':answer=p*(1+r*t);
		System.out.println("Answer is "+ answer);
				 break;
		default: System.out.println("Wrong input");
				 break;
		}
		
		
		
	}
}
