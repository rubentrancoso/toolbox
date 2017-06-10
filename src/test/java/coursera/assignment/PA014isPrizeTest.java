package coursera.assignment;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

public class PA014isPrizeTest {

	@Test
	public void prize() {
		List<Integer> list = Arrays.asList(1,2,3);
		assertArrayEquals(list.toArray(), PA014isPrize.findOptimal(6).toArray());
	}

	@Test
	public void prize1() {
		List<Integer> list = Arrays.asList(1,2,5);
		assertArrayEquals(list.toArray(), PA014isPrize.findOptimal(8).toArray());
	}
	
	@Test
	public void prize2() {
		List<Integer> list = Arrays.asList(2);
		assertArrayEquals(list.toArray(), PA014isPrize.findOptimal(2).toArray());
	}	

}
