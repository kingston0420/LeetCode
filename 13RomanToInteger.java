class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
	    roman.put('I', 1);
	    roman.put('V', 5);
	    roman.put('X', 10);
	    roman.put('L', 50);
	    roman.put('C', 100);
	    roman.put('D', 500);
	    roman.put('M', 1000);
        
        int prev = roman.get(s.charAt(0));
        int total = 0;
        
        for (int i=1; i<s.length(); i++) {
            if (prev < roman.get(s.charAt(i))) {
                total -= prev;
            } else {
                total += prev;
            }
            prev = roman.get(s.charAt(i));
        }
        total += roman.get(s.charAt(s.length()-1));
        return total;
    }
    
    
}