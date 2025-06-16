package june;

import java.util.Arrays;
import java.util.Comparator;

public class Equalizess_16 {



         public int minCost(int[] heights, int[] cost) {
        int n = heights.length;

        // Pair of height and cost
        int[][] towers = new int[n][2];
        for (int i = 0; i < n; i++) {
            towers[i][0] = heights[i];
            towers[i][1] = cost[i];
        }

        // Sort the towers based on height
        Arrays.sort(towers, Comparator.comparingInt(a -> a[0]));

        // Find weighted median height
        long totalCost = 0;
        for (int[] tower : towers) {
            totalCost += tower[1];
        }

        long cumulativeCost = 0;
        int medianHeight = 0;
        for (int[] tower : towers) {
            cumulativeCost += tower[1];
            if (cumulativeCost >= (totalCost + 1) / 2) { // fix: use (totalCost + 1) / 2 for proper median
                medianHeight = tower[0];
                break;
            }
        }

        // Calculate minimum cost to make all heights equal to medianHeight
        long minCost = 0;
        for (int i = 0; i < n; i++) {
            minCost += (long)Math.abs(heights[i] - medianHeight) * cost[i];
        }

        return (int)minCost;
    }

    public static void main(String[] args) {
        Equalizess_16 ob = new Equalizess_16();

        int[] heights = {1, 2, 3};
        int[] cost = {10, 100, 1000};

        System.out.println("Minimum Cost: " + ob.minCost(heights, cost)); // Expected: 120
    }
}
