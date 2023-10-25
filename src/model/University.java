package model;

import java.util.ArrayList;

public class University {
	private ArrayList <Teacher> lst_teachers;
	private ArrayList <Student> lst_students;
	private ArrayList <UniversityClass> lst_classes;
	
	public double calculateSalary(double salary) {
		return 0.0;
	}
	public void printTeachers(Teacher lst_teachers) {
		
	}
	public void printClasses(UniversityClass lst_classes) {
		
	}
	public Student newStudent(Student student) {
		return null;
	}
	public UniversityClass createNewClass(UniversityClass university_class) {
		return null;
	}
	public void classesByStudent (Student student) {
		
	}
	public ArrayList<Teacher> getLst_teachers() {
		return lst_teachers;
	}
	public void addLst_teachers(ArrayList<Teacher> lst_teachers) {
		this.lst_teachers = lst_teachers;
	}
	public ArrayList<Student> getLst_students() {
		return lst_students;
	}
	public void addLst_students(ArrayList<Student> lst_students) {
		this.lst_students = lst_students;
	}
	public ArrayList<UniversityClass> getLst_classes() {
		return lst_classes;
	}
	public void addLst_classes(ArrayList<UniversityClass> lst_classes) {
		this.lst_classes = lst_classes;
	}
	
}
