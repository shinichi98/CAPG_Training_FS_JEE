
public class question2 {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int k=i;
			int result=0;
			while(k!=0) {
				int m=k%10;
				result+=m*m*m;
				k/=10;
			}
			if (i==result) {
				System.out.println(i);
			}
		}
	}
}
