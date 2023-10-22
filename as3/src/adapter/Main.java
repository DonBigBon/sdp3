package adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do Naruto and Sasuke have enough chakra to perform a combined technique? (yes/no): ");
        String chakraResponse = scanner.nextLine();

        if (chakraResponse.equalsIgnoreCase("yes")) {
            System.out.println("Great! They have enough chakra to perform a combined technique.");
            Naruto Naruto = new NarutoTechnique();
            Sasuke Sasuke = new SasukeTechnique();
            Ninja ninja = new NinjaAdapter(Naruto, Sasuke);
            ninja.performNinjaTechnique();
        } else if (chakraResponse.equalsIgnoreCase("no")) {
            System.out.println("Sadly, They've lost. Because, They don't have enough chakra to perform a combined technique.");
        } else {
            System.out.println("Invalid response. Please enter 'yes' or 'no'.");
        }
    }
}