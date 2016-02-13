/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }

    /** Retuns the size of this IntList */
    public int size() {
        if (tail == null) {
            return 1;
        }
        return 1 + tail.size();
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.tail;
        }
        return size;
    }

    /** In class exercise 1: 
      * Returns ith item of this IntList. For 
      * simplicity, assume the item exists. */
    public int get(int i) {
        if (i == 0) {
            return head;
        }

        return tail.get(i - 1);
    }


    public void swapTwo() {
    	// [1, 2, 3, 4, 5, 6]
        // [2, 1, 4, 3, 6, 5]
        // First we swap the front two,
        // skip 2 and swap the rest.

    	int frontVal = L.head;
    	int nextFrontVal = L.tail.head;

    	L.head = nextFrontVal;
    	L.tail.head = frontVal;


    	if (L.tail.tail != null) {
    		L.tail.tail.swapTwo();		
    	}
    }

    public void swapN(int N) {
    	// [1, 2, 3, 4, 5, 6], 3
        // [3, 2, 1, 6, 5, 4]
        // First we swap the front N,
        // skip N and swap the rest

    	reverseN(N);
    	IntList nextSwapLeader = this;
    	for (int i = 0; i < N; i += 1) {
    		nextSwapLeader = nextSwapLeader.tail;
    	}

    	nextSwapLeader.swapN();

    }

    private void reverseN(int N) {
    	// reverses the front N items of a list
    	// [1, 2, 3, 4, 5, 6], 3 --> [3, 2, 1, 4, 5, 6]
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());



    }
} 