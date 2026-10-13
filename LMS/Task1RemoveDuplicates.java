package LMS;

public class Task1RemoveDuplicates {

    public static int removeDuplicates(int[] ids, String[] titles, String[] authors, double[] prices, int n) {
        if (n == 0) {
            return 0;
        }
        int unique = 1;
        for (int i = 1; i < n; i++) {
            if (ids[i] != ids[unique - 1]) {
                ids[unique] = ids[i];
                titles[unique] = titles[i];
                authors[unique] = authors[i];
                prices[unique] = prices[i];
                unique++;
            }
        }
        return unique;
    }
}
