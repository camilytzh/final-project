package model;

import java.util.ArrayList;

public class Course {
	private String name;
	private int classroom;
	private ArrayList <Student> students;
	private Teacher teacher;
	
	public Course(String name, int classroom, Teacher teacher)
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
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + this.name + " | Classroom: " + this.classroom;
	}
}
