import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the AList class.
 *  @author Josh Hug
 */

public class AListTest {
    @Test
    public void testEmptySize() {
        AList L = new AList();
        assertEquals(0, L.size());
    }

    @Test
    public void testInsertAndSize() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(99);
        assertEquals(2, L.size());
    }

    
    @Test
    public void testInsertAndGetBack() {
        AList L = new AList();
        L.insertBack(99);
        assertEquals(99, L.getBack());        
        L.insertBack(36);
        assertEquals(36, L.getBack());        
    }

    
    @Test
    public void testGet() {
        AList L = new AList();
        L.insertBack(99);
        assertEquals(99, L.get(0));        
        L.insertBack(36);
        assertEquals(99, L.get(0));        
        assertEquals(36, L.get(1));        
    }


    @Test
    public void testDelete() {
        AList L = new AList();
        L.insertBack(99);
        assertEquals(99, L.get(0));        
        L.insertBack(36);
        assertEquals(99, L.get(0));
        L.deleteBack(); 
        assertEquals(99, L.getBack());
        L.insertBack(100);
        assertEquals(100, L.getBack());
        assertEquals(2, L.size());
    }

    /** Tests insertion of a large number of items.*/
    @Test
    public void testMegaInsert() {
        AList L = new AList();
        int N = 1000000;
        for (int i = 0; i < N; i += 1) {
            L.insertBack(i);
        }

        for (int i = 0; i < N; i += 1) {
            assertEquals(i, L.get(i));
        }
    }

    public static void main(String[] args) {
        jh61b.junit.TestRunner.runTests("all", AListTest.class);
    }
} 