package model;

public abstract class Teacher {
	private String name;
	private double salary;
	private int experienceYears;
	private int hoursPerWeek;
	
	public Teacher(String name, int experienceYears)
	{
		this.name = name;
		this.experienceYears = experienceYears;
	}
	
	public abstract String getTeacherType();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
}
