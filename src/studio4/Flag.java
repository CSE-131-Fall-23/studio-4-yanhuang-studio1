package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11,11, 11, 5);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledCircle(11, 11, 2);
		StdDraw.filledRectangle(11, 3, 11, 3);
	}
}