package coursera.datastructuresandalgorithms.assignment;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA013isCoveringSegments;

public class PA013isCoveringSegmentsTest {
	
	PA013isCoveringSegments.Segment[] segments;
	
	@Test
	public void test() {
		int[] result = new int[2];
		result[0] = 3;
		result[1] = 6;
		PA013isCoveringSegments.Segment[] segments = new PA013isCoveringSegments.Segment[4];
		segments[0] = new PA013isCoveringSegments.Segment(4,7);
		segments[1] = new PA013isCoveringSegments.Segment(1,3);
		segments[2] = new PA013isCoveringSegments.Segment(2,5);
		segments[3] = new PA013isCoveringSegments.Segment(5,6);
		assertArrayEquals(result, PA013isCoveringSegments.optimalPoints(segments));
	}		
	
	@Test
	public void test1() {
		int[] result = new int[1];
		result[0] = 3;
		PA013isCoveringSegments.Segment[] segments = new PA013isCoveringSegments.Segment[3];
		segments[2] = new PA013isCoveringSegments.Segment(1,3);
		segments[1] = new PA013isCoveringSegments.Segment(2,5);
		segments[0] = new PA013isCoveringSegments.Segment(3,6);
		assertArrayEquals(result, PA013isCoveringSegments.optimalPoints(segments));
	}
	
}
