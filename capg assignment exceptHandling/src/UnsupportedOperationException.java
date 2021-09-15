
class UnsupportedOperationException2 extends Exception{
	public UnsupportedOperationException2(Throwable t) {
        super(t);
    }
	public UnsupportedOperationException2() {
		
	}
}
public class UnsupportedOperationException {
	public static void main(String[] args) {
		int a=5,b=0,c;
		try
		{
			if(b==0)
			throw new UnsupportedOperationException2();
			else{
				c=a/b;
			System.out.println("Result:"+c);
			}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error in code: "+ex.getMessage());
		}
		catch(UnsupportedOperationException2 ex)
		{
			System.out.println("Error: "+ex);
		}
	}
}
