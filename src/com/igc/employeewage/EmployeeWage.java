package com.igc.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		//Welcome message for user
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance;
		int daily_wage = 0;
		
		final int IS_ABSENT = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		
		Random random = new Random();
		
		attendance = random.nextInt(2);
		System.out.println("Attendance="+attendance);
		
		if(attendance == IS_ABSENT) {
			System.out.println("Employee is Absent");
		} else {
			System.out.println("Employee is Present");
			daily_wage = WAGE_PER_HR * FULL_DAY_HR;
		}
		System.out.println("Daily Wage = "+ daily_wage);
	}

}
