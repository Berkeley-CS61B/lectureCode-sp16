/* Represent a list of stuff, where all the "list" work is delegated
 * to a naked recursive data structure. */

public class RotatingSList<Blorp> extends SList<Blorp> {
	public void rotateRight() {
   		Blorp oldBack = super.deleteBack();
   		super.insertFront(oldBack);
   	}
} 