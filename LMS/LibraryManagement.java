package LMS;

import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] ids = new int[n];
        String[] titles = new String[n];
        String[] authors = new String[n];
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.print("  ID: ");
            ids[i] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("  Title: ");
            titles[i] = sc.nextLine().trim();
            System.out.print("  Author: ");
            authors[i] = sc.nextLine().trim();
            System.out.print("  Price: ");
            prices[i] = Double.parseDouble(sc.nextLine().trim());
        }

        int m = Task1RemoveDuplicates.removeDuplicates(ids, titles, authors, prices, n);
        System.out.println("Unique Books Count: " + m);
        for (int i = 0; i < m; i++) {
            System.out.println("[" + ids[i] + "] " + titles[i] + " - Rs. " + prices[i]);
        }

        System.out.print("Enter search word: ");
        String query = sc.nextLine().trim();
        Task2SearchByTitle.searchByTitle(ids, titles, prices, m, query);

        Task3SortByPrice.sortByPrice(ids, titles, authors, prices, m);

        System.out.print("Enter price to search: ");
        double targetPrice = Double.parseDouble(sc.nextLine().trim());
        int index = Task4SearchByPrice.searchByPrice(prices, m, targetPrice);
        if (index != -1) {
            System.out.println("Book found at index " + index + ": [" + ids[index] + "] " + titles[index] + " (Rs. " + prices[index] + ")");
        } else {
            System.out.println("Book not found.");
        }

        System.out.print("Enter target cost S: ");
        double targetCost = Double.parseDouble(sc.nextLine().trim());
        int result = Task5SlidingWindow.minBooksForTargetCost(prices, m, targetCost);
        System.out.println("Minimum Consecutive Books Needed: " + result);

        sc.close();
    }
}