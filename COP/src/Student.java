
public class Student {
	
	int rollno;
	String name;
	void display()
	{
		System.out.println(rollno +"  "+name);
	}

	public static void main(String[] args) {
		Student s= new Student();
		s.name="Dhanashree";
		s.rollno=1;
		s.display();

	}

}
