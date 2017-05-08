package toolbox.codility.lesson5.prefixsums.CountDiv;

public class Solution {
	
//	(A-1)/K is the sum of all the occurrences of the numbers <=(A-1) that are divisible by K.
//	B/K is the sum of all the occurrences of the numbers <= B that are divisible by K.
//	To know the sum of all the occurrences of the numbers between A and B that are divisible by K, just subtract (A-1)/K to B/K.
//	And remember that 0 is divisible by any non-zero number.	
	
	// https://codility.com/demo/results/trainingAGEXCZ-J88/
	
    public int solution(int A, int B, int K) {
    	int result = (int) (Math.floor(B/K)-Math.floor((A-1)/K));
    	if(A%K==0)
    		result++;
    	return result;
    }
}