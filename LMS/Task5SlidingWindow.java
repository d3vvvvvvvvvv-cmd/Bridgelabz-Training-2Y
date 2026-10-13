package LMS;

public class Task5SlidingWindow {

    public static int minBooksForTargetCost(double[] prices, int count, double targetCost) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        double currentSum = 0;
        for (int right = 0; right < count; right++) {
            currentSum = currentSum + prices[right];
            while (currentSum >= targetCost && left <= right) {
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                }
                currentSum = currentSum - prices[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}
