package com.company;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello, World !");
        out.println("The answer to the ultimate question of Life, The Universe, and Everything is: " + computeUltimateAnswer());
    }

    public static int computeUltimateAnswer() {
        return 6 * 7;
    }
}
