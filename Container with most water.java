//bruteforce approach...
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maximumarea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int length = Math.min(height[i],height[j]);
               int breadth = j-i;
               int area = length * breadth;
               maximumarea = Math.max(area,maximumarea); 
            }
            
        }
        return maximumarea;
    }
}
