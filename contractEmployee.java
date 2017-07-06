package assignment13;

public class contractEmployee extends employee
{
	
	public contractEmployee(String name, int age, int empcode, String gender,
			int phno,int pf,int gratuity,int salary)
	{
		super(name, age, empcode, gender, phno, pf, gratuity, salary);
	}
	
	int contractDuration;
	
	public void setDuration(int duration) {this.contractDuration=duration;}
	
	public int getDuration() {return contractDuration;}
	
	void cdisp()
	{
		System.out.println("Contract Duration : "+contractDuration);
	}

}
