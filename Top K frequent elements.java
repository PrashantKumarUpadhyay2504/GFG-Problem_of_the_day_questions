 int[] result = new int[k];
        Map<Integer, Integer> frequencies = new HashMap<>();
        for(int x : nums) {
            frequencies.put(x, frequencies.getOrDefault(x, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> frequentList = new PriorityQueue<>(k, new Compare());
        for(Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
            frequentList.add(entry);
            
            if(frequentList.size() > k) {
                frequentList.poll();
            }
        }
    
        while(!frequentList.isEmpty()) {
            Map.Entry<Integer, Integer> frequentEntry = frequentList.poll();
            result[--k] = frequentEntry.getKey();
        }
        
        return result;
    }
}
class Compare implements Comparator<Map.Entry<Integer, Integer>>
{
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue() == o2.getValue()) {
            return o1.getKey() - o2.getKey();
        }
        
        return o1.getValue() - o2.getValue();
