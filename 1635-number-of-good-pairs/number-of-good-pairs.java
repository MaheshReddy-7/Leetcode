class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>ram=new HashMap<>();
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(ram.containsKey(nums[i])){
                count = count+ram.get(nums[i]);
                ram.put(nums[i],ram.get(nums[i])+1);
            }
            else{
                ram.put(nums[i],1);
            }
        }
        return count;
    }
}