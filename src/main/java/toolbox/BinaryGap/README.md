# Binary Gap

```
package toolbox.BinaryGap;

public class Solution {
	public int solution(int N) {
		int n = N;
		// Initialize the longest value and counter to 0
		int longest = 0;
		int count = 0;
		// While n is not 0, shift to the right until you find a 1  
		while ((n != 0) && (n & 1) != 1)
			n >>= 1;
		// When the shift resulted in a non zero
		while (n != 0) {
			if ((n & 1) == 1) {
				// If 1 is found and the counter is greater than the longest, use it
				// and start counting (again)
				if (count > longest)
					longest = count;
				count = 0;
			} else {
				// Increment counter whenever is a zero
				count++;
			}
			// shit to the right
			n >>= 1;
		}
		return longest;
	}
}
```
