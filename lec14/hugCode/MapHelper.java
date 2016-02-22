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

	public static <A extends Comparable<A>, B> A maxKey(ArrayMap<A, B> am) {
		List<A> keys = am.keys();
		A maxKey = keys.get(0);
		for (int i = 0; i < keys.size(); i += 1) {
			int cmp = keys.get(i).compareTo(maxKey);
			if (cmp > 0) {
				maxKey = keys.get(i);
			}			
		}	
		return maxKey;	
	}

	public static <A extends Number, B extends Number> List<Double> keyValueRatio(ArrayMap<A, B> am, A key) {
		
		return key.doubleValue() / am.get(key).doubleValue();
		
		for (int i = 0; i < keys.size(); i += 1) {
			A key = keys.get(i);
			B value = am.get(key);

			double ratio = key.doubleValue() / value.doubleValue();
			ratios.addLast(ratio);
		}
		return ratios;	
	}


	/* Alternate implementation: 
	
	public static double keyValueRatio(ArrayMap<? extends Number, ? extends Number> am) {
		List<Number> keys = am.keys();
		LinkedList<Double> ratios = new LinkedList<Double>();
		
		for (int i = 0; i < keys.size(); i += 1) {
			Number key = keys.get(i);
			Number value = am.get(key);

			double ratio = key.doubleValue() / value.doubleValue();
			ratios.addLast(ratio);
		}
		return ratios;	
	}*/
	

	public static void main(String[] args) {
		ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
  		am.put("hello", 5);
  		am.put("ketchup", 10);
  		assertEquals(5, (long) MapHelper.get(am, "hello"));
  		assertEquals(null, MapHelper.get(am, "moo"));
  		assertEquals("ketchup", MapHelper.maxKey(am));

		ArrayMap<Integer, Integer> am2 = new ArrayMap<Integer, Integer>();
		am2.put(10, 10);
		am2.put(5, 10);
		List<Double> ratios = MapHelper.keyValueRatio(am2);
		assertEquals(1.0, ratios.get(0), 0.0);
		assertEquals(0.5, ratios.get(1), 0.0);
	}
} 