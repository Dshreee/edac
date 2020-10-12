import java.util.Scanner;

public class Employee {
	int empID;
	String name;
	String hobbies;
	boolean isInterestedInCertification;
	String dob;
	Scanner in = new Scanner(System.in);
	
	void getemp()
	{
		System.out.println(empID +"   "+name+"   "+dob+"   "+hobbies+"   "+isInterestedInCertification);
	}
	void setemp(int id) {
		
		empID=id;
		System.out.println("Enter name- ");
		name = in.nextLine();
		System.out.println("Enter DOB- ");
		dob = in.nextLine();
		System.out.println("Enter hobbies- ");
		hobbies = in.nextLine();
		System.out.println("Interested in certifications ?(y/n)");
		String c = new String(in.next());
		switch(c)
		{
		case "y":
			isInterestedInCertification=true;
			break;
		case "n":
			isInterestedInCertification=false;
			break;
		default:
			isInterestedInCertification=false;
			break;
		}
		
		
	}
	public static void main(String[] args) {
		Employee e[] = new  Employee[5];
		
		for(int i=0;i<5;i++)
			e[i] = new Employee();
		
		for(int i=0;i<5;i++)
			e[i].setemp(i+1);

		System.out.println("ID     "+"Name        "+"DOB     "+"Hobbies         "+"Certifications");
		System.out.println("------------------------------------------------------------------------");
		for(int i=0;i<5;i++)
			e[i].getemp();
	    
		
		

	}

}
