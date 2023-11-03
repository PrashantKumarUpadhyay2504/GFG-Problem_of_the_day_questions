HashMap<Integer, Integer> squares = new HashMap<>();
        for (int i = 0; i < n; i++) {
            squares.put(arr[i] * arr[i], squares.getOrDefault(arr[i] * arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (squares.containsKey(arr[i] * arr[i] + arr[j] * arr[j])) {
                    return true;
                }
            }
        }
        return false;
