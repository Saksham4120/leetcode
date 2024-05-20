class Solution {
    int Expand(String s,int i,int j){
        int count=0;
       while(i >=0 && j< s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
       }
      return count;
        }

    public int countSubstrings(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int j=i;
            int oddans=Expand(s,i,j);
            int evenans=Expand(s,i,j+1);
            total=total+oddans+evenans;
        }
        return total;
    }
}