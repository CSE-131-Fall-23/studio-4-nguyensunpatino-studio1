package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();

        if ("rectangle".equals(shapeType)) {
            StdDraw.clear();
            StdDraw.setCanvasSize(800, 600);

            int redCOmponent = in.nextInt();
            int greenCOmponent = in.nextInt();
            int bileCOmponent = in.nextInt();
            
            
            
            boolean isFilled = in.nextBoolean();
            double centerX = in.nextDouble();
            double centerY = in.nextDouble();
            
            StdDraw.setXscale(0, centerX);
            StdDraw.setYscale(0, centerY);
            
            double halfWidth = in.nextDouble();
            double halfHeight = in.nextDouble();
            
            if (isFilled) {
                StdDraw.filledRectangle(centerX, centerY, halfWidth, halfHeight);
            } else {
                StdDraw.rectangle(centerX, centerY, halfWidth, halfHeight);
            }
        }else {
            System.err.println("Unsupported shape type: " + shapeType);
        }
	}
}
