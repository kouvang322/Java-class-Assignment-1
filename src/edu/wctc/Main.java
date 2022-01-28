package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput.GetUserInput();
        String endMessage = endQuizMessage();

        Scanner keyboard = new Scanner(System.in);

        String userInput = keyboard.nextLine();

        boolean restart = userInput.equals("1");

        while (restart) {
            UserInput.GetUserInput();
            userInput = keyboard.nextLine();
            restart = userInput.equals("1");
        }

        System.out.println(endMessage);

    }
    public static String endQuizMessage(){
        return "The Quiz has ended. Thank you for answering.";
    }
}
