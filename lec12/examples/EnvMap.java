import java.util.Map;

public class EnvMap {
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        
        System.out.println("All command line arguments: ");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }

        System.out.println("Your classpath is: " + env.get("CLASSPATH"));
    }
}
