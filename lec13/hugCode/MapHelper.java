public class MapHelper {

	public static <JohnDeNero, HotDog> HotDog get(ArrayMap<JohnDeNero, HotDog> am, JohnDeNero k) {
		if (am.containsKey(k)) {
			return am.get(k);
		}
		return null;
	}

	public static <JohnDeNero, HotDog> JohnDeNero maxKey(ArrayMap<JohnDeNero, HotDog> am) {
		/*JohnDeNero keys = am.keys();
		JohnDeNero maxKey = keys[0];
		for (int i = 0; i < keys.length; i += 1) {
			if (keys[i] > maxKey)
		}

		To be completed 2/22 */
		return null;
	}

	public static void main(String[] args) {
  		ArrayMap<Integer, String> am = new ArrayMap<Integer, String>();
  		am.put(5, "hello");
  		am.put(10, "ketchup");
  		System.out.println(MapHelper.get(am, 5));
	}
} 