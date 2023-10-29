package model;

import java.util.ArrayList;

import controller.Student;

public class Course {
	private String name;
	private String classroom;
	private ArrayList <Student> students;
	private Teacher teacher;
	
	public Course(String name, String classroom, Teacher teacher)
	{
		this.name = name;
		this.classroom = classroom;
		this.students = new ArrayList<Student>();
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
