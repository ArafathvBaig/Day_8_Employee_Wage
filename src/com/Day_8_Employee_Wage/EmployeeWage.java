package com.Day_8_Employee_Wage;

public class EmployeeWage 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static void main(String[] args) 
	{		
		int empHrs = 0;
		int empCheck =(int) ((Math.random())*10)%3;
		System.out.println(+empCheck);
		switch(empCheck)
		{
		case IS_FULL_TIME:
			System.out.println("Full Time Employee");
			empHrs = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Part Time Employee");
			empHrs = 4;
			break;
		default:
			System.out.println("Employee is Absent");
			empHrs = 0;
			break;
		}
		int empWage = empHrs*EMP_RATE_PER_HR;
		System.out.println("Employee Daily Wage is: "+empWage);		
	}
}
