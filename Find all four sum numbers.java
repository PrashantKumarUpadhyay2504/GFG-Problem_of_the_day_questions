class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
                if(n==0 ) return res;

        for(int i = 0; i < n - 3; i++) {
            // if same element already processed, skip
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // find the remaining sum
            int remainingSum = k - arr[i];

            // create a three-sum problem for the remaining sum
            List<List<Integer>> threeSumSolutions = threeSum(arr, i + 1, remainingSum);

            // add the quadruples to the set
            for (List<Integer> solution : threeSumSolutions) {
                ArrayList<Integer> quadruple = new ArrayList<>();
                quadruple.add(arr[i]);
                quadruple.addAll(solution);
                res.add(quadruple);
            }
        }
        return res;
    }

    private List<List<Integer>> threeSum(int[] arr, int start, int target) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = start; i < arr.length - 2; i++) {
            // if same element already processed, skip
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            // find the remaining sum
            int remainingSum = target - arr[i];

            // create a two-sum problem for the remaining sum
            List<List<Integer>> twoSumSolutions = twoSum(arr, i + 1, remainingSum);

            // add the three-sum solutions to the set
            for (List<Integer> solution : twoSumSolutions) {
                ArrayList<Integer> triple = new ArrayList<>();
                triple.add(arr[i]);
                triple.addAll(solution);
                res.add(triple);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] arr, int start, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = start;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);

                // skip duplicate elements
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }

                left++;
                right--;
            }
        }
        return res;
    }
}

