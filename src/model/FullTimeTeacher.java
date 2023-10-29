package model;
	
public class FullTimeTeacher extends Teacher{
	
	public FullTimeTeacher(String name, int experienceYears)
	{
		super(name, experienceYears);
	}
	
	@Override
	public String getTeacherType() {
		return "Full Time";
	}
	
}
