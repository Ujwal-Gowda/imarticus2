import java.util.Objects;

public class Employee 
{
	private  int Id_number;
	private  String emp_name;
	private  double emp_salary;
	public int getId_number()
	{
		return Id_number;
	}
	public void setId_number(int id_number) 
	{
		this.Id_number = id_number;
	}
	public String getEmp_name() 
	{
		return emp_name;
	}
	public void setEmp_name(String emp_name) 
	{
		this.emp_name = emp_name;
	}
	public double getEmp_salary() 
	{
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) 
	{
		this.emp_salary = emp_salary;
	}
	
	Employee(int Id_number, String emp_name, double emp_salary)
	{
		this.Id_number = Id_number;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		
	}
	@Override
	public String toString()
	{
		String s;
		s="["+ Id_number + "," + emp_name + "," + emp_salary + "]";
		return s;
	}
	@Override
	public boolean(Object o)
	{
		Employee e=(Employee)o;
		
		boolean b=this. Id_number == e.Id_number && this.emp_name equals(e.name) && this.emp_salary == e.emp_salary ;
		
		return b;
	}
	@Override
	public int hashCode(_)
	{
		int hc=this.idnumber+ this.emp_name.hasahCode()+(int)
	
	}
	Employee e1=new Employee(123, "Arun", 20000.0);
	Employee e2=new Employee(123, "Arun", 20000.0);
	Employee e3=new Employee(124, "Varun", 20000.0);
	Employee e4=new Employee(125, "Arjun", 20000.0);
	

}
