package com.pluralsight;

public class FamousQuotesMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n---------- Good Morning Dear, Welcome to The Quote of The Day Application ----------  \n");

        QuoteService quoteService = new QuoteService();

        while (true) {
            try {
                byte selectedNumber = Utilities.PromptForByte("Select Number From 1 to 10:  ");
                Thread.sleep(500);
                System.out.println("\n");
                System.out.println("   ------   " + quoteService.getQuote(selectedNumber - 1) + "   ------   \n");
            } catch (Exception e) {
                System.out.println("Invalid Selection: Please Select from 1 to 10.  \n");
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to see another quote?");
            String command = Utilities.PromptForString("If Yes Please Enter [A], & If You Want to Exit Enter [Any-Key]:  ");
            if (!command.equalsIgnoreCase("A")) {
                break;
            }
        }
    }
}
