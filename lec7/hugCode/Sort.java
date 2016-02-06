public class Sort {

	/* Returns the index of the smallest string starting with k. 
	 * ([0, 2, 3], 1) --> 1   */
	public static int indexOfSmallest(String[] inputs, int k) {
		/* The index of the smallest known so far. */
		int minDex = k;

		for (int i = k; i < inputs.length; i += 1) {
			int cmp = inputs[i].compareTo(inputs[minDex]);

			if (cmp < 0) {
				minDex = i;
			}
		}
		return minDex;

	}

	/** Returns inputs in sorted order, sorting only the last
	    k items. 
	    ([5, 3, 8, 1], 1) --> [5, 1, 3, 8] */
	private static String[] sort(String[] inputs, int k) {
		if (k == inputs.length) {
			return inputs;
		}

		int minDex = indexOfSmallest(inputs, k);
		swap(inputs, k, minDex);
		// move smallest item to front
		// sort rest of the stuff	

		return sort(inputs, k + 1);
	}

	private static void swap(String[] input, int a, int b) {
		String temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}

	/** Return inputs in sorted order, where a < z,
	  * and is nondestructive. */
	public static String[] sort(String[] inputs) {
		return sort(inputs, 0);
	}

	/** prints out strings */
	public static void print(String[] inputs) {

	}

	/** Print out the args in order. */
	public static void main(String[] args) {
		
	}
} 