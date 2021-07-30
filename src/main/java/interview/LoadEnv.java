package interview;

public class LoadEnv {

    public static void main(String[] args) {
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getenv("NAME"));
        System.out.println(args[0]);

    }
}
