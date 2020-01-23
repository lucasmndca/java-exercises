package factoryMethod.client;

import factoryMethod.dialogs.Dialog;
import factoryMethod.dialogs.GalaxyDialog;
import factoryMethod.dialogs.IphoneDialog;

import java.util.Scanner;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {

        boolean didUserAnswer = false;
        Scanner scanner = new Scanner(System.in);

        while(didUserAnswer != true) {
            System.out.println("What type of smartphone would you like? [Galaxy / Iphone]");
            String answer = scanner.nextLine();
            if((answer.toLowerCase().equals("iphone") || answer.toLowerCase().equals("galaxy")) &&
                    !answer.equals("")) {
                didUserAnswer = true;
                generateANewSmartphone(answer);
            } else {
                System.out.println("This smartphone model is currently not available. Please try again");
            }
        }
        printFunctionalities();
    }

    static void generateANewSmartphone(String answer) {
        if(answer.toLowerCase().equals("iphone")) {
            dialog = new IphoneDialog();
        } else {
            dialog = new GalaxyDialog();
        }
    }

    static void printFunctionalities() {
        dialog.printFunctionalities();
    }
}