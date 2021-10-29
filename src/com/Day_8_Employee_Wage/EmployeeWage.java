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
	
	public static void main(String[] args) 
	{
		EmployeeWage obj1=new EmployeeWage();
		while((obj1.totalWorkingHrs<=MAX_WORKING_HOURS) && (obj1.totalWorkingDays<=MAX_WORKING_DAYS))
		{
			
			obj1.empCheck =(int) ((Math.random())*10)%3;
			switch(obj1.empCheck)
			{
			case IS_FULL_TIME:
				obj1.empHrs = 8;
				obj1.working();
				break;
				
			case IS_PART_TIME:
				obj1.empHrs = 4;
				obj1.working();
				break;
				
			default:
				obj1.empHrs=0;
				obj1.working();
				break;
				
			}
		}
	}
}
