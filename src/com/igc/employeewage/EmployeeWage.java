package com.igc.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		//Welcome message for user
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance;
		int daily_wage = 0;
		int month_wage = 0;
		int empType;
		int total_hr = 0;
		int days = 1;
		
		Random random = new Random();
		
		while(days != 21 && total_hr < 100) {
			System.out.println("Day = "+days+"   Total Hr="+total_hr);
			daily_wage = 0;
			attendance = random.nextInt(2);
			System.out.println("Attendance="+attendance);
			
			if(attendance == Constants.IS_ABSENT) {
				System.out.println("Employee is Absent");
			} else {
				System.out.println("Employee is Present");
				
				empType = random.nextInt(2);
				switch(empType) {
					case Constants.IS_PART_TIME:
						System.out.println("Employee is Part Time");
						daily_wage = Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
						total_hr = total_hr + Constants.PART_TIME_HR;
					break;
					case Constants.IS_FULL_TIME:
						System.out.println("Employee is Full Time");
						daily_wage = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
						total_hr = total_hr + Constants.FULL_TIME_HR;
					break;
				}
			}
			System.out.println("Daily Wage = "+ daily_wage);
			month_wage = month_wage + daily_wage;
			System.out.println("###########################");
			days++;
		}
		System.out.println("Total Monthly Wage = "+ month_wage);
	}

}
