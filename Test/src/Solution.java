import java.util.Arrays;

class Solution {
	
    public int[] solution(int[] array) {
    	
    	int[] arrayc = array.clone();
    	        
        Arrays.sort(arrayc);
        
        int result = 0;
        
        for(int i=0; i<array.length; i++) {
        	if(array[i] == arrayc[arrayc.length-1]) {
        		result = i;
        		break;
        	}
        }        
     
        int[] answer = {arrayc[arrayc.length-1], result};
               
        return answer;      
    }
    
    public static void main(String[] args) {
    	
    	Solution s = new Solution(); 
    	
    	int[] array1 = {1, 8, 3};
    	int[] array2 = {9, 10, 11, 8};
    	
    	System.out.println(Arrays.toString(s.solution(array1)));
    	System.out.println(Arrays.toString(s.solution(array2)));
    }
}