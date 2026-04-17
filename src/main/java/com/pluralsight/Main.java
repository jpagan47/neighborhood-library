package com.pluralsight;

import java.util.Scanner;

public class Main {
     static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book(1, "978-0000000001", "The Hobbit", false, "");
        books[1] = new Book(2, "978-0000000002", "1984", false, "");
        books[2] = new Book(3, "978-0000000003", "To Kill a Mockingbird", false, "");
        books[3] = new Book(4, "978-0000000004", "The Great Gatsby", false, "");
        books[4] = new Book(5, "978-0000000005", "Moby Dick", false, "");
        books[5] = new Book(6, "978-0000000006", "Pride and Prejudice", false, "");
        books[6] = new Book(7, "978-0000000007", "Harry Potter", false, "");
        books[7] = new Book(8, "978-0000000008", "The Catcher in the Rye", false, "");
        books[8] = new Book(9, "978-0000000009", "The Lord of the Rings", false, "");
        books[9] = new Book(10, "978-0000000010", "The Alchemist", false, "");
        String mainPrompt = """
                        Main Menu
                1. Show available books
                2. Show checked out books
                3. Exit the application
                
                Please enter your selection.        
              
                """;
        System.out.println(mainPrompt);
        String userSelection = inputScanner.nextLine();



    }





}