package com.Day_8_Employee_Wage;

public class EmployeeWage 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;
	
	int totalWorkingHrs = 0;
	int totalWorkingDays = 0;
	int empHrs = 0;
	int dailyWage;
	int totalWage;
	int empCheck;
	
	public void working()
	{
		totalWorkingHrs=totalWorkingHrs+empHrs;
		totalWorkingDays++;
		if((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
		{
			System.out.println("Randome Check is: "+empCheck);
			System.out.println("Total Working Hours = "+totalWorkingHrs);
			System.out.println("Day = "+totalWorkingDays);
			dailyWage = empHrs*EMP_RATE_PER_HR;
			System.out.println("Employee Daily Wage is: "+dailyWage);
			totalWage = totalWorkingHrs*EMP_RATE_PER_HR;
			System.out.println("Total Wage is: "+totalWage);
			System.out.println(" ");
		}
	}
	public void limitations()
	{
		while((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
		{
			
			empCheck =(int) ((Math.random())*10)%3;
			switch(empCheck)
			{
			case IS_FULL_TIME:
				empHrs = 8;
				working();
				break;
				
			case IS_PART_TIME:
				empHrs = 4;
				working();
				break;
				
			default:
				empHrs=0;
				working();
				break;
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		EmployeeWage obj1=new EmployeeWage();
		obj1.limitations();
	}
}
