package me.artspb.example.project;

public class Main {

    private static final String TEMPLATE = "%s, %s!";

    public static void main(String[] args) {
        sayHello(format("Hello"))
    }

    private static String format(String greeting) {
        return String.format(TEMPLATE, greeting, "world");
    }

    private static void sayHello(String message) {
        System.out.println(message);
    }
}
