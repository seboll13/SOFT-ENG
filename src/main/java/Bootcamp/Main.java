package com.company;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("The ultimate question of Life, The Universe, and Everything is: " + computeUltimateQuestion());
    }

    public static String computeUltimateQuestion() {

        out.println("Hello, World !");
        out.println("The answer to the ultimate question of Life, The Universe, and Everything is: " + computeUltimateAnswer());
        return "still searching...";
    }

    public static int computeUltimateAnswer() {
        return 6 * 7;
    }
}
