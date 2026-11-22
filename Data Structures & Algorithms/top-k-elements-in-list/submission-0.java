class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int key = nums[i];
            if(map.containsKey(key)) map.put(key, map.getOrDefault(key, 0) + 1);
            else map.put(key, 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k; i++) {
            answer[i] = entries.get(i).getKey();
        }
        return answer;
    }
}
