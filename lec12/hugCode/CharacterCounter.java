import java.util.Map;
import java.util.HashMap;

public class CharacterCounter {

	public static void main(String[] args) {
		In in = new In("CharacterCounter.java");
		Map<Character, Integer> cc = new HashMap<Character, Integer>();
		while (!in.isEmpty()) {
			char x = in.readChar();
			if (cc.containsKey(x)) {
				int countSoFar = cc.get(x);
				countSoFar += 1;
				cc.put(x, countSoFar);
			} else {
				cc.put(x, 1);
			}
		}
		System.out.println(cc);
	}
} 