class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int seek = target - n;
            if(map.containsKey(seek)) return new int[]{map.get(seek), i};
            else map.put(n, i);
        }
        return new int[]{-1, -1};
    }
}
