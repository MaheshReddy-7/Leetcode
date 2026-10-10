import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>hm = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int ans = -1;
        int r = n / 2;
        // Find majority element
        for(int macha:hm.keySet()) {
            if(hm.get(macha)>r) {
                ans = macha;
            }
        }
        return ans;
    }
}