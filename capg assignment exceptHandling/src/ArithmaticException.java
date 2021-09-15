
public class ArithmaticException {
	public static void main(String[] args) {
		int a,b,c;
		try
		{
			a=5;b=0;
			c=a/b;
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error in code: " + ex.getMessage());
		}
	}
}
