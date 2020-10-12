//radius is set through constructor
package spherepackage;

public class VolumeSphere {
	private double radius;
	public VolumeSphere(double radius) {		//constructor
		this.radius=radius;
	}

	public void volume() {						//calculate volume
		double volume;
		volume = 4/3 * Math.PI * radius * radius * radius;
		System.out.println("Volume of sphere with radius "+radius+" is "+volume);
	}

}
