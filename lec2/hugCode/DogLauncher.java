/** The DogLauncher class will 'test drive' the Dog class */
public class DogLauncher {
	public static void main(String[] args) {
		Dog maya = new Dog(30);
		Dog tiny = new Dog(5);
		
		Dog larger = Dog.maxDog(maya, tiny);
		larger.makeNoise();
	}
} 