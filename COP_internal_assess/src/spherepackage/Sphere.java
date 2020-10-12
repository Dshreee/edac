/*Write a java program to find volume and surface area of 
a sphere using multiple classes*/

package spherepackage;

public class Sphere {

	public static void main(String[] args) {
		VolumeSphere v = new VolumeSphere(5);		
		SurfaceSphere s = new SurfaceSphere();
		v.volume();							//get the volume of sphere
		System.out.println("-----------------------------------------------------");
		s.setSurfaceArea();					//setter function for surface area of sphere
		s.getSurfaceArea();					//getter function for surface area of sphere


	}

}
