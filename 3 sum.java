import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //bruteforce approach
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(ans);
                        set.add(ans);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
