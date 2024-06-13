class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String str = Integer.toString(x);
        int n = str.length();
        int j = n - 1;
        
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        
        return true;
    }
}