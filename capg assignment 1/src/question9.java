import java.util.Scanner;
public class question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of three subjects");
		int a=sc.nextInt(); int b=sc.nextInt();int c=sc.nextInt();
		int s1[]= {a,b,c};
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		int s2[]= {a,b,c};
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		int s3[]= {a,b,c};
		
	System.out.println("Total marks in each subject");
	System.out.println("Subject A " + (s1[0]+s2[0]+s3[0]));
	System.out.println("Subject B " + (s1[1]+s2[1]+s3[1]));
	System.out.println("Subject C " + (s1[2]+s2[2]+s3[2]));
	System.out.println("Average marks in each subject");
	System.out.println("Subject A " + (s1[0]+s2[0]+s3[0])/3.0);
	System.out.println("Subject B " + (s1[1]+s2[1]+s3[1])/3.0);
	System.out.println("Subject C " + (s1[2]+s2[2]+s3[2])/3.0);
	System.out.println("Total marks scored by student");
	System.out.println("Subject A " + (s1[0]+s1[1]+s1[2]));
	System.out.println("Subject B " + (s2[0]+s2[1]+s2[2]));
	System.out.println("Subject C " + (s3[0]+s3[1]+s3[2]));
	System.out.println("Average marks scored by student");
	System.out.println("Subject A " + (s1[0]+s1[1]+s1[2])/3.0);
	System.out.println("Subject B " + (s2[0]+s2[1]+s2[2])/3.0);
	System.out.println("Subject C " + (s3[0]+s3[1]+s3[2])/3.0);
		
	}

}
