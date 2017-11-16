package assesment.prismo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RGBColorsTest {

	@Test
	public void test1() {
		String result = RGBColors.parseColor(RGBColors.RGB888, "0xFFFFFF");
		assertEquals("255 255 255", result);
	}

	@Test
	public void test11() {
		String result = RGBColors.parseColor(RGBColors.RGB888, "0x010203");
		assertEquals("1 2 3", result);
	}

	@Test
	public void test2() {
		String result = RGBColors.parseColor(RGBColors.RGB888, "255 255 255");
		assertEquals("0xFFFFFF", result);
	}
	
	@Test
	public void test3() {
		String result = RGBColors.parseColor(RGBColors.RGB565​, "0x6103");
		assertEquals("12 8 3", result);
	}	
	
	@Test
	public void test4() {
		String result = RGBColors.parseColor(RGBColors.RGB565​, "10 6 1");
		assertEquals("0x50C1", result);
	}		

}
