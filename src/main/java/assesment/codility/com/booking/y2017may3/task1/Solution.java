package assesment.codility.com.booking.y2017may3.task1;

public class Solution {

	public void solution(int N) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if((i%3)==0) {
				sb.append("Fizz");
			}
			if((i%5)==0) {
				sb.append("Buzz");
			}
			if((i%7)==0) {
				sb.append("Woof");
			}
			if(sb.length()>0) {
				System.out.println(sb.toString());
				sb.setLength(0);
			} else {
				System.out.println(i);
			}
		}
    }
}