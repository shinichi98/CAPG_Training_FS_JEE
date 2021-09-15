import java.util.*;
public class RandomValues {
	public static void main(String[] args) {
		HashMap<Integer,Double> hash=new HashMap<Integer,Double>();
		hash.put(1,10.0);
		hash.put(2,20.0);
		hash.put(3,30.0);
		hash.put(4,50.0);
		hash.put(5,40.0);
		hash.put(6,30.0);
		hash.put(33,20.0);
		hash.put(1,101.0);
		hash.put(2,990.0);
		hash.put(13,90.0);
		
		
		Iterator hmIterator = hash.entrySet().iterator();
        System.out.println("HashMap after adding bonus marks:");
  
        while (hmIterator.hasNext()) {
            Map.Entry<Integer,Double> mapElement = (Map.Entry<Integer,Double>)hmIterator.next();
            double value = mapElement.getValue();
            System.out.println(mapElement.getKey() + " : " + value);
        }
	}
}
