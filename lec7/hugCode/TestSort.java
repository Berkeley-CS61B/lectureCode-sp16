import org.junit.Test;
import static org.junit.Assert.*;

/** This class tests the Sort class. */
public class TestSort {	
	/** Tests the Sort.sort method */
	@Test
	public void testSort() {
		String[] inputs = {"milvia", "zero", "josh", "trump"};
		String[] expected = {"josh", "milvia", "trump", "zero"};
		String[] actual = Sort.sort(inputs);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void testIndexOfSmallest() {
		String[] inputs = {"milvia", "zero", "josh", "trump"};
		int expected = 2;
		int actual = Sort.indexOfSmallest(inputs, 2);

		assertEquals(expected, actual);

		expected = 3;
		actual = Sort.indexOfSmallest(inputs, 3);
		assertEquals(expected, actual);

	}

	public static void main(String[] args) {
		jh61b.junit.TestRunner.runTests("all", TestSort.class);
	}
} 

/* We are reinventing wheel.

		if (expected.length != actual.length) {
			System.out.println("Lengths did not match.");
			System.out.println("Expected: " + expected.length);
			System.out.println("Actual: " + actual.length);
		}

		for (int i = 0; i < expected.length; i+=1) {
			if (expected[i].equals())
		}
*/