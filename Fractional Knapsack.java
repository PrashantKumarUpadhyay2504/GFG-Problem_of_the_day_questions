class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, Comparator.comparingDouble((Item item) -> (double)item.value / item.weight).reversed());

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + arr[i].weight <= W) {
                // Add the whole item to the knapsack
                totalValue += arr[i].value;
                currentWeight += arr[i].weight;
            } else {
                // Add a fractional part of the item to fill the knapsack
                double remainingWeight = W - currentWeight;
                totalValue += (arr[i].value * remainingWeight) / arr[i].weight;
                break; // Knapsack is full
            }
        }

        return totalValue;
    }
}
