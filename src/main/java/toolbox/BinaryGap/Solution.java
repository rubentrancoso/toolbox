package toolbox.BinaryGap;

public class Solution {
	public int solution(int N) {
		// Initialize the longest value and counter to 0
		int longest = 0;
		int count = 0;
		// While n is not 0, shift to the right until you find a 1  
		while ((N != 0) && (N & 1) != 1)
			N >>= 1;
		// When the shift resulted in a non zero
		while (N != 0) {
			if ((N & 1) == 1) {
				// If 1 was found and the counter is greater than the longest, use it
				// and start counting (again)
				if (count > longest)
					longest = count;
				count = 0;
			} else {
				// Increment counter whenever is a zero
				count++;
			}
			// shit to the right
			N >>= 1;
		}
		return longest;
	}
}