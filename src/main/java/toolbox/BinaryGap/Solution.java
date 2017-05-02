package toolbox.BinaryGap;

public class Solution {
    public int solution(int N) {
    	int n = N;
    	int longest = 0;
    	int count = 0;
    	while((n != 0) && (n & 1) != 1) n >>= 1;
    	while(n != 0) {
    		if((n & 1) == 1) {
    			if(count>longest)
    				longest = count;
    			count = 0;
    		} else {
    			count++;
    		}
    		n >>= 1;
    	}
		return longest;
    }
}