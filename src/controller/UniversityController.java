package controller;

import java.util.ArrayList;
import java.util.Random;

import model.Course;
import model.Student;
import model.Teacher;
import model.University;

public class UniversityController {
	private University university;
	
	public UniversityController(University university)
	{
		this.university = university;
	}
	
	public University getUniversity()
	{
		return this.university;
	}
	
	public ArrayList<Student> getCollegeStudents()
	{
		return this.university.getCollegeStudents();
	}
	
	public ArrayList<Teacher> getCollegeTeachers(){
		return this.university.getCollegeTeachers();
	}
	
	public Student getStudentById(int id)
	{
		for(Student student: this.university.getCollegeStudents())
		{
			if(student.getId() == id)
			{
				return student;
			}
		}
		return null;
	}
	
	public ArrayList<Course> getCoursesByStudentId(int id)
	{
		ArrayList<Course> studentCourses = new ArrayList<Course>();
		for(Course course: this.university.getCollegeCourses())
		{
			for(Student student: course.getStudents())
			{
				if(student.getId() == id)
				{
					studentCourses.add(course);
				}
			}
		}
		return studentCourses;
	}
	public void createStudent(String name, int age)
	{
		Student student = new Student(name, age);
		System.out.println("Student Registered " + student);
		this.university.addCollegeStudent(student);
		int coursesSize = this.university.getCollegeCourses().size();
		int randomCourse = new Random().nextInt(coursesSize);
		System.out.println("Added into course " + this.university.getCollegeCourses().get(randomCourse));
		this.university.addStudentToCourse(student, randomCourse);
	}
	
	public void createCourse(String name, int classroom)
	{
		Random rd = new Random();
		int teacherSize = this.university.getCollegeTeachers().size();
		int randomTeacherIndex = rd.nextInt(teacherSize);
		Teacher randomTeacher = this.university.getCollegeTeachers().get(randomTeacherIndex);
		Course course = new Course(name, classroom, randomTeacher);
		this.university.addCollegeCourse(course);
		for(Student student: this.university.getCollegeStudents())
		{
			if(rd.nextInt(10) > 4)
			{
				course.addStudent(student);
			}
		}
	}
}
