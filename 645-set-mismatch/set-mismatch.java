class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>temp = new HashSet<>();
        int duplicate = -1;
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                duplicate = nums[i];
            }
            else{
                temp.add(nums[i]);
            }
        }
        int missing = 1;
        for(int i=1;i<=nums.length;i++){
            if(!temp.contains(i)){
                missing = i;
                break;
            }
        }
        int arr[] = {duplicate,missing};
        return arr;
        
    }
}