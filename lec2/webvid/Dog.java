public class Dog {
	/* Size of the dog in standard dog size units. */
	public int size;

	/* This is a constructor. It tells us how to construct
	 * dogs from our ideal notion of dogness. */

	public Dog(int s) {
		size = s;
	}

	public void makeNoise() {
		if (size < 20) {
			System.out.println("hideous yapping");
		} else if (size < 50) {
			System.out.println("bark!");
		} else {
			System.out.println("aroooooooooooo!");
		}
	}

	/* Return the larger of dog d1 and dog d2. */
	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.size > d2.size) {
			return d1;
		}
		return d2;
	}

	public Dog maxDogComparedToMe(Dog otherDog) {
		if (size > otherDog.size) {
			return this;
		}
		return otherDog;
	}

} 