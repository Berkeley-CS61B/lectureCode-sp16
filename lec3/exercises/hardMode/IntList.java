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
        return 0; 
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        /* your code here */
        return 0;
    }

    /** In class exercise 1: 
      * Returns ith item of this IntList. For 
      * simplicity, assume the item exists. */
    public int get(int i) {
        return 0;
        /** your code here */
    }

    /** Returns the Intlist as a string. Automatically called
      * whenever you try to print an IntList. */
    public String toString() {
        /* your code here */
        return null;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        return L;
    }    

    public static void main(String[] args) {

        // Test your answers by uncommenting. Or use the Visualizer.
        // IntList L = new IntList(5, null);
        // L.tail = new IntList(7, null);    
        // L.tail.tail = new IntList(9, null);
        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());        
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));  

    }
} 