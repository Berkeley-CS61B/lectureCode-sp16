import static org.junit.Assert.*;
import java.util.List;
import java.util.LinkedList;

public class MapHelper {

	public static <A, B> B get(ArrayMap<A, B> am, A k) {
		if (am.containsKey(k)) {
			return am.get(k);
		}
		return null;
	}

	public static <K extends Comparable<K>, V> K maxKey(ArrayMap<K, V> am) {
	   	List<K> keys = am.keys();
	   	K maxKey = keys.get(0);
	   	for (int i = 0; i < keys.size(); i += 1) {
	   		int cmp; 
	   		cmp = keys.get(i).compareTo(maxKey);
	      	if (cmp > 0) {
	      		maxKey = keys.get(i);
	      	}
	   	}
	   	return maxKey;
	}


	/* Won't compile due to lack of Generic Covariance in Java. 
	public static double keyValueRatio(ArrayMap<Number, Number> am, A key) {
		return key.doubleValue() / am.get(key).doubleValue();
	} */
	

	/* Valid implementations: 

	public static <A extends Number, B extends Number> double keyValueRatio(ArrayMap<A, B> am, A key) {
		return key.doubleValue() / am.get(key).doubleValue();
	}*/

	/*
	public static <A extends Number> double keyValueRatio(ArrayMap<A, ? extends Number> am, A key) {
		return key.doubleValue() / am.get(key).doubleValue();
	}*/

/*public static <K extends Dog> void allBark(ArrayMap<K, ?> am) {
	for (Dog d : am.keys()) {
		d.bark();
	}
}
*/
	public static void main(String[] args) {
		ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
  		am.put("hello", 5);
  		am.put("ketchup", 10);
  		assertEquals(5, (long) MapHelper.get(am, "hello"));
  		assertEquals(null, MapHelper.get(am, "moo"));
//  		assertEquals("ketchup", MapHelper.maxKey(am));
/*
	  ArrayMap<FrenchDog, Integer> am2 = new ArrayMap<FrenchDog, Integer>();
	  am2.put(new FrenchDog("francis"), 10);
	  am2.put(new FrenchDog("francis jr"), 20);
	  allBark(am2);
		*/
	}
} 