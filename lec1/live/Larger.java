public class Larger {

	/* "public static" is the equivalent
	   of def in Python */
	public static int larger(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		System.out.println(larger(10, 20));
		// String s = larger(5, 9);
		
	}
} 
/*
{ : beginning of something
} : end of something
*/