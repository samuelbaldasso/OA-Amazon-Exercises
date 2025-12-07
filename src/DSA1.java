import java.util.*;

public class DSA1 {
    public static int optimalMergeCost(int[] files) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int f : files) {
            pq.add(f);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            int merged = a + b;
            totalCost += merged;

            pq.add(merged);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] files = {8, 4, 6, 12};
        System.out.println(optimalMergeCost(files)); // 58
    }
}
