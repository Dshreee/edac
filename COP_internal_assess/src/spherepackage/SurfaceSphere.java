//radius is set by user input(Scanner)
package spherepackage;

import java.util.Scanner;

public class SurfaceSphere {
	private double radius;
	public void setSurfaceArea() {			//setter function
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of sphere - ");
		radius = in.nextDouble();
		in.close();
	}

	public void getSurfaceArea() {			//getter and calculate volume function
		double surfacearea;
		surfacearea = 4 * Math.PI * radius* radius;
		System.out.println("Surface area of sphere with radius "+radius+" is "+surfacearea);
	}

}
