public class Dog {
    private String name;
    private String breed;
    private double size;

    public Dog(String n, String b, double s) {
        name = n;
        breed = b;
        size = s;
    }

    @Override
    public String toString() {
        return name + " is a " + breed + " weighing " + size + " lbs.";
    }	

	public static void main(String[] args) {
		Dog d = new Dog("Frank", "dachshund", 5);
        System.out.println(d);
	}
} 