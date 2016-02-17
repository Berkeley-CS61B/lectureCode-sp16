public class Dog {
    private String name;
    private int fingers;    

    public Dog(String n, int f) {
        name = n;
        fingers = f;
    }

    @Override
    public String toString() {
        return name + " is a dog with " + fingers + " fingers.";
    }	

	public static void main(String[] args) {
		Dog d = new Dog("Weird Frank", 5);
		System.out.println(d);
	}
} 