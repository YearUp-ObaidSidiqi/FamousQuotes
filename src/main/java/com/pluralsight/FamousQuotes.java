package com.pluralsight;

public class FamousQuotes {
    public static void main(String[] args) throws InterruptedException {

      Quotes quotes = new Quotes();
        while (true) {
            try {
                byte selectedNumber = Utilities.PromptForByte("Select Number From 1 to 10:  ");
                Thread.sleep(500);
                System.out.println("\n");
                System.out.println("   ------   "+quotes.quotes[selectedNumber-1]+"   ------   \n");
            } catch (Exception e) {
                System.out.println("Invalid Selection: Please Select from 1 to 10.  \n");
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to See another Quote?  ");
            String commond = Utilities.PromptForString("If Yes Please Enter [A] & If You Want to Exit Enter [Any-Key]:  \n*If You Want a Random Quote Type Random*     ");
           if ((commond.equalsIgnoreCase("Random"))){
                int i =(int)( (Math.random()*9)+1);
                System.out.println("   ------   "+quotes.quotes[i-1]+"   ------   \n");
           }else  if (!commond.equalsIgnoreCase("A")){
               break;
           }
        }
    }

}
