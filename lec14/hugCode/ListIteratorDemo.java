import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	List<Integer> friends = new ArrayList<Integer>();
	friends.add(5);
	friends.add(23);
	friends.add(42);
	for (int x : friends) {
		System.out.println(x);
	}

	Iterator<Integer> friendViewer = friends.iterator();
	while (friendViewer.hasNext()) {
		System.out.println(friendViewer.next());
	}
	}
} 