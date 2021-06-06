package org.example;


import java.util.Scanner;

public class PrintingQuotes {
// Quotation marks are often used to denote the start and end of a string.
// But sometimes we need to print out the quotation marks themselves by using escape characters.
//
//Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
    public static void main(String[] args) {

        Scanner getQuote = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = getQuote.nextLine();


        Scanner getAuthor = new Scanner(System.in);
        System.out.print("Who said it ");
        String author = getAuthor.nextLine();

         System.out.print(author +  " says, \"" + quote+ "\"");

    }

}
