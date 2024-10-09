package com.pluralsight;

public class Quotes {
    public String[] quotes;
    public Quotes (){
        System.out.println("\n---------- Good Morning Dear Welcome to The Quote of The Day Application ----------  \n");
        quotes = new String[10];
        quotes[0] = "The only limit to our realization of tomorrow is our doubts of today.";
        quotes[1] = "Success is not final, failure is not fatal: It is the courage to continue that counts.";
        quotes[2] = "It does not matter how slowly you go as long as you do not stop.";
        quotes[3] = "Believe you can and you're halfway there.";
        quotes[4] = "Your time is limited, don't waste it living someone else's life.";
        quotes[5] = "The best way to predict the future is to create it.";
        quotes[6] = "It always seems impossible until it's done.";
        quotes[7] = "Start where you are. Use what you have. Do what you can.";
        quotes[8] = "Act as if what you do makes a difference. It does.";
        quotes[9] = "The harder you work for something, the greater you'll feel when you achieve it.";

    }
    public String getQuote(int index) {
        return quotes[index];
    }
}


/*if (index >= 0 && index < quotes.length) {
            return quotes[index];
        } else {
            throw new IllegalArgumentException("Quote index out of bounds.");
        }*/