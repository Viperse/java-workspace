class Solution {
	
    public String solution(int q, int r, String code) {
    	char[] codeArr = code.toCharArray();
    	
    	
    	String answer = "";
    	
    	for(int i=0; i<codeArr.length; i++) {
    		if(i % q == r) {
    			answer += codeArr[i];
    		}
    	}
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	Solution s = new Solution();
    	System.out.println(s.solution(3, 1, "qjnwezgrpirldywt"));
    	System.out.println(s.solution(1, 0, "programmers"));
    }
}