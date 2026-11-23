class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int slow = 0;
        for(int fast=0; fast<n; fast++){
            char c = s.charAt(fast);
            while(map.containsKey(c)){
                char sc = s.charAt(slow);
                map.remove(sc); slow++;
            }
            map.put(c, 1);
            length = Math.max(length, fast - slow + 1);
        }
        return length;
    }
}
