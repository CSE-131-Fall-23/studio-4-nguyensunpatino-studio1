package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		int canvasWidth = 900;
		int canvasHeight = 600;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
	    StdDraw.setXscale(0, canvasWidth);
	    StdDraw.setYscale(0, canvasHeight);

	        // Draw the left band (color: blue)
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.filledRectangle(canvasWidth / 6, canvasHeight / 2, canvasWidth / 6, canvasHeight / 2);

	        // Draw the middle band (color: white)
	    StdDraw.setPenColor(StdDraw.WHITE);
	    StdDraw.filledRectangle(canvasWidth / 2, canvasHeight / 2, canvasWidth / 6, canvasHeight / 2);

	        // Draw the right band (color: red)
	     StdDraw.setPenColor(StdDraw.RED);
	     StdDraw.filledRectangle(5 * canvasWidth / 6, canvasHeight / 2, canvasWidth / 6, canvasHeight / 2);
	  }
}