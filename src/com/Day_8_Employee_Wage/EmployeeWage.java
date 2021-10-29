package com.Day_8_Employee_Wage;

public class EmployeeWage 
{
	public static void main(String[] args) 
	{
		int IS_PRESENT = 1;
		int empCheck = (int)(Math.random()*10)%2;
		System.out.println(+empCheck);
		if(empCheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
