
class Solution {
    public String removeDuplicates(String s) {
         StringBuilder ans = new StringBuilder();
         for (int index = 0; index < s.length() ; index++) {
            if(ans.length() > 0 && ans.charAt(ans.length() - 1) == s.charAt(index)) {
                ans.deleteCharAt(ans.length() - 1); 
            } else {
                ans.append(s.charAt(index)); //ca
            }
         }
        return ans.toString();
    }
}
