import java.util.Scanner;
public class question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of three subjects");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a>=60 && b>=60 && c>= 60) {
			System.out.println("Passed");
		}
		else if((a>=60 && b>=60) || (c>=60 && b>=60) || (a>=60 && c>=60)) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}

	}
	}
