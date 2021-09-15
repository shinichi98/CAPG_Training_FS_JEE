class Pair<T,t>{
	T key;
	t value;
	
	public T getKey() {
		return key;
	}
	public t getValue() {
		return value;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public void setValue(t value) {
		this.value = value;
	}
}
public class Keyvaluepair {
	 public static void main(String[] args) {
			
			Pair<String,String> p1=new Pair<>();
			p1.setKey("1");
			p1.setValue("one");
			System.out.println(p1.getKey()+"  :  "+p1.getValue());
			
			Pair<String,java.util.Date> p2=new Pair<>();
			p2.setKey("Today is");
			p2.setValue(new java.util.Date());
			System.out.println(p2.getKey()+"  :  "+p2.getValue());
			

		}
}
