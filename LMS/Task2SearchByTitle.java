package LMS;

public class Task2SearchByTitle {

    public static void searchByTitle(int[] ids, String[] titles, double[] prices, int count, String query) {
        String q = query.toLowerCase();
        boolean found = false;
        System.out.println("Search Results for '" + query + "':");
        for (int i = 0; i < count; i++) {
            if (titles[i].toLowerCase().contains(q)) {
                System.out.println("- Found: [" + ids[i] + "] " + titles[i] + " (Rs. " + prices[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("- No matching books found.");
        }
    }
}