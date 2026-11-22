class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] array = new int[26];
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            Arrays.fill(array, 0);
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                array[c - 'a']++;
            }
            String key = Arrays.toString(array);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
