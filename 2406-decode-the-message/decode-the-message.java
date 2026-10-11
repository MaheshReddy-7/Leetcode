class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>temp = new HashMap<>();
        int n = 97;
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(ch!=' ' && !temp.containsKey(ch)){
                temp.put(ch,(char)n);
                n++;
            }
        }
        String ans ="";
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch!=' '){
                char val = temp.get(ch);
                ans = ans+val;
            }
            else{
                ans = ans+' ';
            }
        }
        return ans;
    }
}