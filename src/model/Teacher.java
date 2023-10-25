package model;

public class Teacher {
	private String name;
	private boolean isFullTime;
	private double salary;
	private int experienceYears;
	private int hoursPerWeek;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFullTime() {
		return isFullTime;
	}
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
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
