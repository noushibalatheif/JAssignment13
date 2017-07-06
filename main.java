package assignment13;

public class main
{
	public static void main(String[] args)
	{
		permanentEmployee p=new permanentEmployee
				("John", 35, 1001, "Male", 989545, 200, 300, 15000);
		p.setpcode("PM100");
		System.out.println("Permanent Employee Details : ");
		p.display();
		p.disp();
		
		
		contractEmployee c=new contractEmployee
				("Mary", 24, 1112, "female", 9856224, 500, 600, 10000);
		c.setDuration(6);
		c.getDuration();
		System.out.println("Contract Employee Details : ");
		c.display();
		c.cdisp();
	}

}
