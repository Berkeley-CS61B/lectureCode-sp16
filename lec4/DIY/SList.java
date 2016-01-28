/* Represent a list of integers, where all the "list" work is delegated
 * to a naked IntList. */

public class SList {
	public class IntNode {
		public int item;     /* Equivalent of first */
		public IntNode next; /* Equivalent of rest */

		public IntNode(int i, IntNode h) {
			item = i;
			next = h;		
		}
	} 

	private IntNode sentinel;

	/** Creates an empty list. */
	public SList() {
	}

	public SList(int x) {
	}

	/** Adds an item of the front. */
	public void insertFront(int x) {
	}

	/** Gets the front item of the list. */
	public int getFront() {
	}

	/** Puts an item at the back of the list. */
	public void insertBack(int x) {
	}

	/** Returns the back node of our list. */
	private IntNode getBackNode() {
	}

	/** Returns last item */
	public int getBack() {
	}

	public int size() {
	}

	public static void main(String[] args) {
		SList s1 = new SList();
		s1.insertBack(6);
		s1.insertFront(4);
		s1.insertFront(3);
		System.out.println(s1.getBack());
		//System.out.println(s1.getFront());
	}
} 