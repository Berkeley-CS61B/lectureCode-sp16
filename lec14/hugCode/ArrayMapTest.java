import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayMapTest {

	@Test
	public void test() {
		ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
		am.put(2, 5);
	    int expected = 5;
	    // Assert is ambiguous and will not compile.
	    // Understanding this ambiguity was an exercise in class.
		// assertEquals(expected, am.get(2));
	}

	public static void main(String[] args) {
		jh61b.junit.TestRunner.runTests(ArrayMapTest.class);
	}
} 