class Solution {
    public int reverse(int x) {
        long output = 0;
        int digit = 0;
        while (x != 0) {
            digit = x%10;
            x = x/10;
            output = output*10 + digit; 
        }
        if((output>= Integer.MIN_VALUE) && (output<= Integer.MAX_VALUE)) {
                return (int)output; 
            } else {
                return 0;
            }
    }
}