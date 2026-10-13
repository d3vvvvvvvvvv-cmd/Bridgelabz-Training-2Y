package LMS;

public class Task4SearchByPrice {

    public static int searchByPrice(double[] prices, int count, double targetPrice) {
        int low = 0;
        int high = count - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (prices[mid] == targetPrice) {
                return mid;
            } else if (prices[mid] < targetPrice) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
