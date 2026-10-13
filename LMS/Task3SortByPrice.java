package LMS;

public class Task3SortByPrice {

    public static void sortByPrice(int[] ids, String[] titles, String[] authors, double[] prices, int count) {
        int swaps = 0;
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (prices[j] < prices[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tempId = ids[i];
                ids[i] = ids[minIndex];
                ids[minIndex] = tempId;

                String tempTitle = titles[i];
                titles[i] = titles[minIndex];
                titles[minIndex] = tempTitle;

                String tempAuthor = authors[i];
                authors[i] = authors[minIndex];
                authors[minIndex] = tempAuthor;

                double tempPrice = prices[i];
                prices[i] = prices[minIndex];
                prices[minIndex] = tempPrice;

                swaps++;
            }
        }
        System.out.println("Books Sorted by Price:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". [" + ids[i] + "] " + titles[i] + " - Rs. " + prices[i]);
        }
        System.out.println("Total Swaps: " + swaps);
    }
}
