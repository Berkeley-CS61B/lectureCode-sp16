/** Array based list.
 *  @author Josh Hug
 */

/* The next item ALWAYS goes in the size postiion */

public class AList {
	/* the stored integers */
	private int[] items;
	private int size;

	private static int RFACTOR = 2;

    /** Creates an empty list. */
    public AList() {
    	size = 0;
    	items = new int[100];
    }

    /** Resize our backing array so that it is
      * of the given capacity. */
    private void resize(int capacity) {
    	int[] a = new int[capacity];
    	System.arraycopy(items, 0, a, 0, size);
    	items = a;    	
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {    	
    	if (size == items.length) {
    		resize(size * RFACTOR);
    	}

    	items[size] = x;
    	size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public int getBack() {
    	int lastActualItemIndex = size - 1;
    	return items[lastActualItemIndex];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int deleteBack() {
		int itemToReturn = getBack();
		/* setting to zero not strictly necessary, but
		 * it's a good habit (we'll see why soon) */
		items[size - 1] = 0;
		size = size - 1;
		return itemToReturn;
    }

    public static void main(String[] args) {
    	AList a1 = new AList();
    	int i = 0;
    	while (i < 100000000) {
    		a1.insertBack(i);
    		i = i + 1;
    	}
    	System.out.println("Done!");
    }
} 