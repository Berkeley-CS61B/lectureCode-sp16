/* This program will sum all the command line arguments,
 * assuming they are integers. */
public class ArgsSum {
	public static void main(String[] args) {
		int index = 0;
		int total = 0;

		while (index < args.length) {
			total = total + Integer.parseInt(args[index]); 
			index += 1;
		}

		System.out.println(total);
	}
} 