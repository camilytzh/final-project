package persistence;

import controller.UniversityController;
import model.Course;
import model.Student;
import model.Teacher;
import model.TeacherFactory;
import model.University;

public class DataInitializer {
	
	public static UniversityController loadUniversity()
	{
		University university =  new University();
		UniversityController univController = new UniversityController(university);
		
		Teacher partTimeTeacher1 = TeacherFactory.createTeacher("part", "Sandra", 3, 30);
		Teacher partTimeTeacher2 = TeacherFactory.createTeacher("part", "Armando", 12, 20);
		Teacher fullTimeTeacher1 = TeacherFactory.createTeacher("full", "Pedro", 7, 40);
		Teacher fullTimeTeacher2 = TeacherFactory.createTeacher("full", "Ana", 11, 40);
		university.addCollegeTeacher(fullTimeTeacher1);
		university.addCollegeTeacher(fullTimeTeacher2);
		university.addCollegeTeacher(partTimeTeacher1);
		university.addCollegeTeacher(partTimeTeacher2);
		
		Student student1 = new Student("Elmer", 19);
		Student student2 = new Student("Patricia", 25);
		Student student3 = new Student("Agustin", 30);
		Student student4 = new Student("Alana", 21);
		Student student5 = new Student("Pamela", 56);
		Student student6 = new Student("Juan", 20);
		university.addCollegeStudent(student1);
		university.addCollegeStudent(student2);
		university.addCollegeStudent(student3);
		university.addCollegeStudent(student4);
		university.addCollegeStudent(student5);
		university.addCollegeStudent(student6);
		
		Course course1 = new Course("Calculus", 101, partTimeTeacher1);
		Course course2 = new Course("Algebra", 102, partTimeTeacher2);
		Course course3 = new Course("Physics", 203, fullTimeTeacher1);
		Course course4 = new Course("Biology", 203, fullTimeTeacher2);
		course1.addStudent(student1);
		course1.addStudent(student2);
		course1.addStudent(student5);
		course2.addStudent(student3);
		course2.addStudent(student4);
		course2.addStudent(student6);
		course3.addStudent(student1);
		course3.addStudent(student2);
		course3.addStudent(student4);
		course4.addStudent(student3);
		course4.addStudent(student6);
		course4.addStudent(student5);
		university.addCollegeCourse(course1);
		university.addCollegeCourse(course2);
		university.addCollegeCourse(course3);
		university.addCollegeCourse(course4);
		
		return univController;
	}
}
