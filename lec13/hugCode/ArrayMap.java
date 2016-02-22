public class ArrayMap<K, V> {
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
		return values[findKey(key)];
	}

	public boolean containsKey(K key) {					
		int i = findKey(key);
		return (i > -1);
	}

	public K[] keys() {
		return keys;
	}
} 