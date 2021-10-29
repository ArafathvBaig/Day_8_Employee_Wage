package com.Day_8_Employee_Wage;

public class EmployeeWage 
{
	public static void main(String[] args) 
	{
		int IS_PRESENT = 1;
		int EMP_RATE_PER_HR = 20;
		int empHrs = 0;
		int empCheck = (int)(Math.random()*10)%2;
		System.out.println(+empCheck);
		if(empCheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			empHrs=8;
		}
		else
		{
			System.out.println("Employee is Absent");
			empHrs=0;
		}
		int empWage = empHrs*EMP_RATE_PER_HR;
		System.out.println("Employee Daily Wage is: "+empWage);
	}
}
