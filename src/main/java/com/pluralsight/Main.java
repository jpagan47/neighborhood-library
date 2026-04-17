package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book(1, "978-0000000001", "The Hobbit", false, "");
        books[1] = new Book(2, "978-0000000002", "1984", true, "");
        books[2] = new Book(3, "978-0000000003", "To Kill a Mockingbird", false, "");
        books[3] = new Book(4, "978-0000000004", "The Great Gatsby", false, "");
        books[4] = new Book(5, "978-0000000005", "Moby Dick", false, "");
        books[5] = new Book(6, "978-0000000006", "Pride and Prejudice", false, "");
        books[6] = new Book(7, "978-0000000007", "Harry Potter", false, "");
        books[7] = new Book(8, "978-0000000008", "The Catcher in the Rye", false, "");
        books[8] = new Book(9, "978-0000000009", "The Lord of the Rings", false, "");
        books[9] = new Book(10, "978-0000000010", "The Alchemist", false, "");

        do {
            String mainPrompt = """
                            Main Menu
                    1. Show available books
                    2. Show checked out books
                    3. Exit the application
                    
                    Please enter your selection.        
                    
                    """;
            System.out.println(mainPrompt);
            String userSelection = inputScanner.nextLine();

            switch (userSelection) {
                case "1":
                    showAvailableMenu(books);
                    break;
                case "2":
                    showCheckOutMenu(books);
                    break;
                case "3":

                    break;
                default:
                    System.err.println("Invalid selection");


            }

        } while (true);


    }

    private static void showCheckOutMenu(Book[] books) {

        System.out.println("These are the unavailable books");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut) {
                System.out.print(books[i].tittle + " ");
                System.out.print(books[i].id + " ");
                System.out.println(books[i].isbn + " ");
                System.out.println(books[i].checkedOutTo);
            }
        }
        System.out.println("");
        String prompt = """
                1. Check in a book
                2. Exit to main menu
                Enter your selection                
                """;
        System.out.println(prompt);
        String userSelection = inputScanner.nextLine();

        switch (userSelection) {
            case "1":

                System.out.println("Enter book number you want to check in");
                userSelection = inputScanner.nextLine();
                int id = Integer.parseInt(userSelection);


                books[id].isCheckedOut = false;
                books[id].checkedOutTo = "";

                break;
            case "2":

                break;

            default:
                System.err.println("Invalid selection");
        }


    }

    private static void showAvailableMenu(Book[] books) {
        System.out.println("These are the available books");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut == false) {
                System.out.print(books[i].tittle + " ");
                System.out.print(books[i].id + " ");
                System.out.println(books[i].isbn + " ");
            }
        }
        System.out.println("");
        String prompt = """
                1. Check out a book
                2. Exit to main menu
                Enter your selection                
                """;
        System.out.println(prompt);
        String userSelection = inputScanner.nextLine();

        switch (userSelection) {
            case "1":

                System.out.println("Enter book number you want to check out");
                userSelection = inputScanner.nextLine();
                int id = Integer.parseInt(userSelection);

                System.out.println("Enter your name");
                String name = inputScanner.nextLine();
                books[id].isCheckedOut = true;
                books[id].checkedOutTo = name;

                break;
            case "2":

                break;

            default:
                System.err.println("Invalid selection");
        }
    }
}