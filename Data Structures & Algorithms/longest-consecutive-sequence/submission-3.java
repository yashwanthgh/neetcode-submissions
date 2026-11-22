class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);

        int longest = 1;

        for(int n: set){
            int count = 1;
            if(set.contains(n-1)) continue;
            int current = n;
            while(set.contains(current+1)) {
                count++; current++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
