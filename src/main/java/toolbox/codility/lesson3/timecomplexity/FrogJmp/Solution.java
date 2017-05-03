package toolbox.codility.lesson3.timecomplexity.FrogJmp;


// https://codility.com/programmers/lessons/3-time_complexity/frog_jmp/

// Complexity:
// expected worst-case time complexity is O(1);
// expected worst-case space complexity is O(1).

public class Solution {
	// https://codility.com/demo/results/trainingZZ79PV-J7X/
    public int solution(int X, int Y, int D) {
    	int delta = Y-X;
    	int intPart = delta/D;
    	if(delta%D != 0)
    		intPart++;
        return intPart;
    }
}