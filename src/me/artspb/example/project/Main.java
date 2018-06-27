package me.artspb.example.project;

public class Main {

    private static final String TEMPLATE = "%s, %s!";

    public static void main(String[] args) {
        sayHello(format())
    }

    private static String format() {
        return String.format(TEMPLATE, "Hello", "world");
    }

    private static void sayHello(String message) {
        System.out.println(message);
    }
}
