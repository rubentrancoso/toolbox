package coursera.datastructuresandalgorithms.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class PA013isCoveringSegments {

	public static int[] optimalPoints(Segment[] segments) {
		int n = segments.length;
		Vector<Integer> points = new Vector<Integer>();

		Arrays.sort(segments, new Comparator<Segment>() {
			@Override
			public int compare(final Segment segment1, final Segment segment2) {
				final int end1 = segment1.end;
				final int end2 = segment2.end;
				if (end1 > end2)
					return 1;
				if (end1 < end2)
					return -1;
				return 0;
			}
		});

		int limit = segments[0].start - 1;
		for (int i = 0; i < n; i++) {
			int start = segments[i].start;
			int end = segments[i].end;
			if (start > limit) {
				points.add(end);
				limit = end;
			}
		}

		int index = 0;
		int[] result = new int[points.size()];
		for (int i : points)
			result[index++] = i;

		return result;
	}

	public static class Segment {
		int start, end;

		Segment(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Segment[] segments = new Segment[n];
		for (int i = 0; i < n; i++) {
			int start, end;
			start = scanner.nextInt();
			end = scanner.nextInt();
			segments[i] = new Segment(start, end);
		}
		scanner.close();
		int[] points = optimalPoints(segments);
		System.out.println(points.length);
		for (int point : points) {
			System.out.print(point + " ");
		}
	}

}
