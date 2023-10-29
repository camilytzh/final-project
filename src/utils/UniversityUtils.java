package utils;

import model.Teacher;

public class UniversityUtils {
	public static double BASE_SALARY = 525;
	public static int WEEK_HOURS = 40;
	public static double calculateFullTimeSalary(Teacher teacher, int experienceYears) {
		return BASE_SALARY * 1.1 * teacher.getExperienceYears();
	}
	
	public static double calculatePartTimeSalary(Teacher teacher) {
		return BASE_SALARY * teacher.getHoursPerWeek() / WEEK_HOURS;
	}
}
