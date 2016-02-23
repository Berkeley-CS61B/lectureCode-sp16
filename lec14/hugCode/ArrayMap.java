import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayMap<K, V> implements Iterable<K> {
	private K[] keys;
	private V[] values;
	private int size;

	public ArrayMap() {
		keys = (K[]) new Object[100];
		values = (V[]) new Object[100];
		size = 0;
	}

	private int findKey(K key) {
		for (int i = 0; i < size; i += 1) {
			if (keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public void put(K key, V value) {
		int i = findKey(key);
		if (i > -1) {
			values[i] = value;
			return;
		}

		keys[size] = key;
		values[size] = value;
		size += 1;
	}

	public V get(K key) {
		if (findKey(key) < 0) {
			throw new IllegalArgumentException(key + " was not a valid key.");
		}
		return values[findKey(key)];
	}

	public boolean containsKey(K key) {					
		int i = findKey(key);
		return (i > -1);
	}

	public List<K> keys() {
		if (size == 0) {
			return null;
		}
		return Arrays.asList(keys).subList(0, size);
	}

	public class MapWizard implements Iterator<K> {
		private int notionOfWhereHeIs;

		public MapWizard() {
			notionOfWhereHeIs = 0;
		}

		public boolean hasNext() {
			return (notionOfWhereHeIs < size);
		}

		public K next() {
			K currentThing = keys[notionOfWhereHeIs];
			notionOfWhereHeIs += 1;
			return currentThing;
		}
	}

	public Iterator<K> iterator() {
		return new MapWizard();
	}

} 