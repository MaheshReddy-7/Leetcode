class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>temp=new HashMap<>();
        int ans = 0;
        for(int i=0;i<jewels.length();i++){
            char ch = jewels.charAt(i);
            temp.put(ch,temp.getOrDefault(ch,0)+1);
            
        }
        for(int i=0;i<stones.length();i++){
            char ch = stones.charAt(i);
            if(temp.containsKey(ch)){
                ans += temp.get(ch);
            }
        }
        return ans;
        
    }
}