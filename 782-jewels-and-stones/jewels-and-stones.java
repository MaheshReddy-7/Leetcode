class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int temp = 0;
        for(int i=0;i<jewels.length();i++){
            char ch = jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                char chst = stones.charAt(j);
                if(ch==chst){
                    temp+=1;
                }
            }
        }
        return temp;
        
    }
}