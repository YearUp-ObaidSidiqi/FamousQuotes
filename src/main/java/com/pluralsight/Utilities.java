package com.pluralsight;
import java.util.Scanner;

public class Utilities {


    static Scanner scanner = new Scanner(System.in);

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine().trim();
        return userInput;
    }


    public static byte PromptForByte(String prompt) {
        System.out.print(prompt);
        byte userinput = scanner.nextByte();
        scanner.nextLine();
        return userinput;
    }



}