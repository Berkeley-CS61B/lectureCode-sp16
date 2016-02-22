public class FrenchDog extends Dog {

	@Override
	public void bark() {
		System.out.println(name + " says: Le bark. Le bark.");
	}

	public FrenchDog(String name) {
		super(name);
	}	
} 