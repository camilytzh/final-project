package model;

import java.util.ArrayList;

public class UniversityClass {
	private String name;
	private String classroom;
	private ArrayList <Student> lst_students;
	private Teacher teacher;
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
	public ArrayList<Student> getLst_students() {
		return lst_students;
	}
	public void setLst_students(ArrayList<Student> lst_students) {
		this.lst_students = lst_students;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
