/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        /* your code here */
    }

    /** Retuns the size of this IntList */
    public int size() {
        /* your code here */        
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        /* your code here */
    }

    /** In class exercise 1: 
      * Returns ith item of this IntList. For 
      * simplicity, assume the item exists. */
    public int get(int i) {
        return 0;
        /** your code here */
    }

    public String toString() {
        /* your code here */
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
    }
} 