package viewer;

import controller.UniversityController;
import model.Course;
import model.Student;
import model.Teacher;

public class Main {
	public static void main(String[] args) {
		
	}
	
	public static void showAllTeachers(UniversityController universityController)
	{
		for(Teacher teacher: universityController.getUniversity().getCollegeTeachers())
		{
			System.out.println(teacher);
		}
	}
	
	public static void showAllCourses(UniversityController universityController)
	{
		for(Course course: universityController.getUniversity().getCollegeCourses())
		{
			System.out.println(course);
		}
	}
	
	public static void showCoursePeopleByOption(UniversityController universityController,
												int option)
	{
		Course course = universityController.getUniversity().getCollegeCourses().get(option - 1);
		System.out.println("From class: " + course);
		System.out.println("Teacher: " + course.getTeacher());
		System.out.println("Students: ");
		for(Student student: course.getStudents())
		{
			System.out.println(student);
		}
	}
}
