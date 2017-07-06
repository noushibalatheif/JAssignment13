package assignment13;

public class permanentEmployee extends employee
{

	public permanentEmployee(String name, int age, int empcode, String gender,
			int phno,int pf,int gratuity,int salary)
	{
		super(name, age, empcode, gender, phno, pf, gratuity, salary);
	}

	String permanentCode;

	public void setpcode(String pcode)
	{
		this.permanentCode=pcode;
	}
	
	public String getpcode()
	{
		return  permanentCode;
	}
	
	void disp()
	{
		System.out.println("PermanentCode : "+ permanentCode);
	}

}
