import java.util.Arrays;

class Solution {	
    public String solution(String my_string, int num1, int num2) {
        
    	char ch1 = my_string.charAt(num1);
    	char ch2 = my_string.charAt(num2);
    	  	
        return null;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String my1 = "hello";
		String my2 = "I love you";
		
		System.out.println(s.solution(my1, 1, 2));
		System.out.println(s.solution(my2, 3, 6));
	}
}