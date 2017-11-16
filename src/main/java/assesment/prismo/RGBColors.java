package assesment.prismo;

import java.util.Scanner;

public class RGBColors {

	private static Scanner sc;
	public static final String RGB888 = "RGB888";
	public static final String RGB565​ = "RGB565";

	private static final int UNKNOW_INPUT = -1;
	private static final int HEX_INPUT = 0;
	private static final int RGB​_INPUT = 1;

	private static final int SPLITER_HEX_SIZE = 1;
	private static final int SPLITER_RGB_SIZE = 3;

	public static String parseColor(String rgbFormat, String color) {
		String colorString = color.trim();
		int inputType = geType(colorString);
		Long[] colorArray = getColor(colorString);
		switch (inputType) {
		case RGBColors.HEX_INPUT:
			return getRGBFromFormat(rgbFormat, colorArray[0]);
		case RGBColors.RGB​_INPUT:
			return getHexFromFormat(rgbFormat, colorArray);

		}
		return null;
	}

	private static String getHexFromFormat(String rgbFormat, Long[] color) {
		long result;
		switch(rgbFormat) {
		case RGB888:
			result = color[0] << 16;
			result |= (color[1] << 8);
			result |= (color[2]);
			return String.format("0x%04X", result);
		case RGB565​:
			result = color[0] << 11;
			result |= (color[1] << 5);
			result |= (color[2]);
			return String.format("0x%04X", result);
		}
		return null;
	}

	private static String getRGBFromFormat(String rgbFormat, Long colorArray) {
		long r, g, b;
		switch(rgbFormat) {
		case RGB888:
			r = (colorArray >> 16) & 0xFF;
			g = (colorArray >> 8) & 0xFF;
			b = colorArray & 0xFF;;
			return String.format("%d %d %d", r, g, b);
		case RGB565​:
			r = (colorArray >> 11) & 0x1F;
			g = (colorArray >> 5) & 0x3F;
			b = colorArray & 0x1F;;
			return String.format("%d %d %d", r, g, b);
		}
		return null;
	}

	private static int geType(String color) {
		String[] splited = color.split("[ ]+");
		int typeLengtht = splited.length;
		switch (typeLengtht) {
		case SPLITER_HEX_SIZE:
			return RGBColors.HEX_INPUT;
		case SPLITER_RGB_SIZE:
			return RGBColors.RGB​_INPUT;
		}
		return RGBColors.UNKNOW_INPUT;
	}

	private static Long[] getColor(String color) {
		String[] splited = color.split("[ ]+");
		int typeLengtht = splited.length;
		Long[] result = new Long[typeLengtht];
		switch (typeLengtht) {
		case SPLITER_HEX_SIZE:
			result[0] = Long.decode(splited[0]);
			break;
		case SPLITER_RGB_SIZE:
			for (int i = 0; i < typeLengtht; i++) {
				result[i] = Long.decode(splited[i]);
			}
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			String rgbFormat = sc.nextLine();
			if (rgbFormat.equals("")) {
				break;
			}
			String color = sc.nextLine();
			String result = parseColor(rgbFormat, color);
			System.out.println(result);
		}
	}

}
