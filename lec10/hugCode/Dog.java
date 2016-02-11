public class Dog implements OurComparable {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    /* We are going to do a more restricted thing,
     * than demanded by the API. So I'm
     * just going to assume the o is a dog.
     * I just don't know how to compare myself to
     * lettuce.
     */
    public int compareTo(OurComparable o) {
        Dog uddaDog = (Dog) o;
        return this.size - uddaDog.size;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }
}