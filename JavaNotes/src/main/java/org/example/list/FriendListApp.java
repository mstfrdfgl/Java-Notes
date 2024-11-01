package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendListApp {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Friends List Menu ---");
            System.out.println("1 - Add Friend");
            System.out.println("2 - Remove Friend");
            System.out.println("3 - Check if Friend Exists");
            System.out.println("4 - Show All Friends");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // newline karakterini temizler

            switch (choice) {
                case 1:
                    System.out.print("Enter friend's name to add: ");
                    String friendToAdd = scanner.nextLine();
                    friends.add(friendToAdd);
                    System.out.println(friendToAdd + " has been added to the friends list.");
                    break;

                case 2:
                    System.out.print("Enter friend's name to remove: ");
                    String friendToRemove = scanner.nextLine();
                    if (friends.remove(friendToRemove)) {
                        System.out.println(friendToRemove + " has been removed from the friends list.");
                    } else {
                        System.out.println(friendToRemove + " is not in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter friend's name to check: ");
                    String friendToCheck = scanner.nextLine();
                    if (friends.contains(friendToCheck)) {
                        System.out.println(friendToCheck + " is in the friends list.");
                    } else {
                        System.out.println(friendToCheck + " is not in the list.");
                    }
                    break;

                case 4:
                    System.out.println("Friends list: " + friends);
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}
