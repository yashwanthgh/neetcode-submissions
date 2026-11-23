class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int start = 0, end = n-1;
        int water = 0;
        while(start < end){
            int width = end - start;
            int store = 0;
            if(heights[start] <= heights[end]){
                store = heights[start] * width;
                start++;
            } else {
                store = heights[end] * width;
                end--;
            }
            water = Math.max(water, store);

        }
        return water;
    }
}
