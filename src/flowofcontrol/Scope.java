package flowofcontrol;

public class Scope {

    public static String msg = "This is my message";

    public static void newMethod() {
        System.out.println(msg);

    }

    public static void main(String[] args) {
        newMethod();
    }
}
