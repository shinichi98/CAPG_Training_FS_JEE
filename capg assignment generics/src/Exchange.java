
class Swap{
public static <T> void swap(T[] ar,int i, int j){
	T temp=ar[i];
	ar[i]=ar[j];
	ar[j]=temp;
}
}

public class Exchange {

	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,6,7,8,9,10};
		Swap.swap(arr,1,5);
		for(Integer s:arr)
		System.out.println(s);
		
	}

}