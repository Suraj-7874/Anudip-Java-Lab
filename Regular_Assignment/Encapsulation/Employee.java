//1) Write a Java program to create a class called Employee with private instance variables employee_id, employee_name,
// and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a 
// getter method for the salary variable that returns a formatted string.

import java.util.*;

public class Employee{
  Scanner sc = new Scanner(System.in);
  private int employee_id = 01 ;
  private String employee_name = "Suraj";
  private String employee_salary = "20000";

  public int getEmp_Id() 
	{
		return employee_id;
	}
	public void setEmp_Id(int employee_id) 
	{
		this.employee_id = employee_id;
	}
	public String getEmp_Name() 
	{
		return employee_name;
	}
	public void setEmp_Name(String employee_name) 
	{
		this.employee_name = employee_name;
	}
  public String getEmp_Salary() 
	{
		return employee_salary;
	}
}
