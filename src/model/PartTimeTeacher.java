package model;

public class PartTimeTeacher extends Teacher{
	
	public PartTimeTeacher(String name, int experienceYears, int hoursPerWeek)
	{
		super(name, experienceYears);
		this.setHoursPerWeek(hoursPerWeek);
	}

	@Override
	public String getTeacherType() {
		return "Part Time";
	}
}
