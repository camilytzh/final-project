package model;

import utils.UniversityUtils;

public class TeacherFactory {
	public static Teacher createTeacher(String type, String name,
										int experienceYears,
										int hoursPerWeek){
		Teacher teacher = null;
		double calculatedSalary = 0.0;
		if(type.equals("full"))
		{
			teacher = new FullTimeTeacher(name, experienceYears);
			teacher.setHoursPerWeek(UniversityUtils.WEEK_HOURS);
			calculatedSalary = UniversityUtils.calculateFullTimeSalary(teacher, experienceYears);
			teacher.setSalary(calculatedSalary);
		}
		else
		{
			teacher = new PartTimeTeacher(name, experienceYears, hoursPerWeek);
			calculatedSalary = UniversityUtils.calculatePartTimeSalary(teacher);
			teacher.setSalary(calculatedSalary);
		}
		return teacher;
	}
}
