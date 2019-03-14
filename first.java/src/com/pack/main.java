package com.pack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.pack.model.Employee;
import com.pack.service.EmployeeBO;


public class main {

	public static void main(String[] args) throws Exception {
Scanner s=new Scanner(System.in);
int ch,num,i;
String name,dob,desg;
float sal;
System.out.println("####Employee Info####");
System.out.println("Menu");
System.out.println("1.Add employee");
System.out.println("2.Update employee");
System.out.println("3.Delete employee");
System.out.println("4.View employee");
do{
	System.out.println("Enter choice");
	ch=Integer.parseInt(s.nextLine());
	switch(ch)
	{
	case 1:
		System.out.println("Enter employee name");
		name=s.nextLine();
		System.out.println("Enter salary");
		sal=Float.parseFloat(s.nextLine());
		System.out.println("Enter dob");
		dob=s.nextLine();
		System.out.println("Enter designation");
		desg=s.nextLine();
		Random r=new Random();
		num=r.nextInt(900000)+100000;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		Date d=null;
		try{
			d=sdf.parse(dob);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
		Employee e=new Employee(num,name,sal,d,desg);
		EmployeeBO.insertEmployee(e);
		/*i=EmployeeBO.insertEmployee(e);
		if(i==1)
			System.out.println("Employee inserted successfully");*/
		break;
	case 2:
		System.out.println("Enter emp id to be updated");
		num=Integer.parseInt(s.nextLine());
		System.out.println("Enter employee salary");
		sal=Float.parseFloat(s.nextLine());
		System.out.println("Enter designation");
		desg=s.nextLine();
		Employee e1=new Employee(num,sal,desg);
		EmployeeBO.updateEmployee(e1);
		/*i=EmployeeBO.updateEmployee(e1);
		if(i==1)
			System.out.println("Employee updated successfully");*/
		break;
	case 3:
		System.out.println("Enter employee id to be deleted");
		num=Integer.parseInt(s.nextLine());
		EmployeeBO.deleteEmployee(num);
		/*i=EmployeeBO.deleteEmployee(num);
		if(i==1)
			System.out.println("Employee deleted successfully");*/
		break;
	case 4:
		List<Employee> l=EmployeeBO.fetchEmployee();
		System.out.format("%-15s %-25s %-10s %-15s %-10s\n","EmployeeID","EmployeeName","Salary","Date of Birth","Designation");
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		for(Employee e2:l)
		{
			System.out.format("%-15s %-25s %-10s %-15s %-10s\n",e2.getId(),e2.getName(),e2.getSalary(),sdf1.format(e2.getDob()),e2.getDesignation());
		}
		break;
	default:
		System.out.println("Wrong Choice");
		break;
	}
}while(ch<5);
	}

}
