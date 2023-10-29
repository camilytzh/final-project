package model;

import java.util.ArrayList;

public class University {
	private ArrayList <Teacher> collegeTeachers;
	private ArrayList <Student> collegeStudents;
	private ArrayList <Course> collegeCourses;
	
	public University()
	{
		this.collegeTeachers = new ArrayList<Teacher>();
		this.collegeStudents = new ArrayList<Student>();
		this.collegeCourses = new ArrayList<Course>();
	}
	
	public University(ArrayList<Teacher> teachers,
					  ArrayList<Student> students,
					  ArrayList<Course> courses)
	{
		this.collegeTeachers = teachers;
		this.collegeStudents = students;
		this.collegeCourses = courses;
	}
	
	public ArrayList<Teacher> getCollegeTeachers() {
		return this.collegeTeachers;
	}
	public void setCollegeTeachers(ArrayList<Teacher> collegeTeachers) {
		this.collegeTeachers = collegeTeachers;
	}
	public ArrayList<Student> getCollegeStudents() {
		return this.collegeStudents;
	}
	public void setCollegeStudents(ArrayList<Student> collegeStudents) {
		this.collegeStudents = collegeStudents;
	}
	public ArrayList<Course> getCollegeCourses() {
		return this.collegeCourses;
	}
	public void setCollegeCourses(ArrayList<Course> collegeCourses) {
		this.collegeCourses = collegeCourses;
	}
	
	
	
}
