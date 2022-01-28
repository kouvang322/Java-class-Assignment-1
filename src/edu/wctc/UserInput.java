package edu.wctc;

import java.util.Scanner;

public class UserInput {

    public static void GetUserInput(){
        Scanner keyboard = new Scanner(System.in);

        int userChoice = 0;
        int[] arr = new int[5];
        String[][] preferOptions = {{"mild", "spicy"}, {"tea", "coffee"}, {"breakfast", "brunch"}, {"summer", "winter"}, {"paper", "plastic"}};

        System.out.println("Welcome to Preference Quiz!");
        System.out.println("***************************");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Do you prefer " + preferOptions[i][0] + " or " + preferOptions[i][1] + "?");
            System.out.println("Enter 0 for the left preference option");
            System.out.println("Enter 1 for the right preference option");

            int userInput = Integer.parseInt(keyboard.nextLine());
            userChoice += userInput;
        }

        System.out.println("Your score: " + userChoice);

        if(userChoice < 3){
            System.out.println("You prefer life to be calm and organized.");

        }else if(userChoice == 3){
            System.out.println("You prefer a good balance in life");

        }else{
            System.out.println("You prefer life to be spontaneous and active.");
        }

        System.out.println("*******************************");
        System.out.println("Would you like to take the quiz again?");
        System.out.println("Enter 1 to take quiz again. Enter any other key to quit.");
    }
}
