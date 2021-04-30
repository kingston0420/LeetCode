class Solution {
    public boolean isPalindrome(int x) {
        int digit = 0;
        int reverse = 0;
        if (x<0 || (x%10==0 && x!=0)) {
            return false;
        }
        while (x>reverse) {
            digit = x%10;
            x = x/10;
            reverse = reverse*10 + digit;
        }
        if (x == reverse || x==reverse/10) {
            return true;
        } else {
            return false;
        }
    }
}