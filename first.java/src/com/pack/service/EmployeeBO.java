package com.pack.service;

import java.util.List;

import com.pack.DAO.EmployeeDAO;
import com.pack.model.Employee;

public class EmployeeBO
{
public static void insertEmployee(Employee e) throws Exception
{
	EmployeeDAO.insertEmployee(e);
	//return ie;
}
public static void updateEmployee(Employee e) throws Exception
{
	EmployeeDAO.updateEmployee(e);
	//return i;
}
public static void deleteEmployee(int num) throws Exception
{
	EmployeeDAO.deleteEmployee(num);
	//return i;
}
public static List<Employee> fetchEmployee() throws Exception
{
	List<Employee> l=EmployeeDAO.fetchEmployee();
	return l;
}
}
