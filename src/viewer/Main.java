package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import controller.UniversityController;
import model.Course;
import model.Student;
import model.Teacher;
import persistence.DataInitializer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UniversityController univController = DataInitializer.loadUniversity();
		
		String generalMessage = "Welcome to Globant University!\n1. Show all professors\n2. Show all courses\n3. Create student\n4. Create course\n5. Show all courses by student id\n6. Exit";
		String option = "10";
		while(!option.equals("6"))
		{
			System.out.println(generalMessage);
			System.out.print("Enter an option: ");
			option = scanner.nextLine();
			System.out.println("\n\n***************************\n\n");
			if(option.equals("1"))
			{
				showAllTeachers(univController);
			} else if(option.equals("2"))
			{
				showAllCourses(univController);
				System.out.println("\n\n***************************\n\n");
				System.out.println("To show all information of a course, please select the course option");
				System.out.print("Enter one of the course options: ");
				int optionForSubMenu = Integer.parseInt(scanner.nextLine());
				System.out.println("\n\n***************************\n\n");
				int courseSizes = univController.getUniversity().getCollegeCourses().size();
				if(optionForSubMenu < 1 && optionForSubMenu >= courseSizes)
				{
					System.out.println("You selected a wrong course option :C");
				} else
				{
					showCoursePeopleByOption(univController, optionForSubMenu);
				}
			} else if(option.equals("3"))
			{
				System.out.print("Please, enter the following data to register a student:\nName: ");
				String studentName = scanner.nextLine();
				System.out.print("Age: ");
				int studentAge = Integer.parseInt(scanner.nextLine());
				univController.createStudent(studentName, studentAge);
			} else if (option.equals("4"))
			{
				System.out.print("Please, enter the following data to register a course:\nCourse Name: ");
				String courseName = scanner.nextLine();
				System.out.print("Classroom number: ");
				int classroomNum = Integer.parseInt(scanner.nextLine());
				univController.createCourse(courseName, classroomNum);
			} else if(option.equals("5"))
			{
				System.out.println("To retrieve the classes that a student is enrolled, you have to enter the ID: ");
				for(Student student: univController.getCollegeStudents())
				{
					System.out.println(student.getId());
				}
				System.out.print("Please enter a student id: ");
				int studentId = Integer.parseInt(scanner.nextLine());
				ArrayList<Course> coursesByStudent = univController.getCoursesByStudentId(studentId);
				if(coursesByStudent.size() == 0)
				{
					System.out.println("The student neither exists nor is enrolled in a course");
				} else
				{
					Student tmpStudent = univController.getStudentById(studentId);
					System.out.println("The student: " + tmpStudent + "\nThe courses he is enrolled are: ");
					for(Course course: coursesByStudent)
					{
						System.out.println(course);
					}
				}
			} else if(!option.equals("6"))
			{
				System.out.println("Please, select a correct answer!");
			}
			System.out.println("\n\n***************************\n\n");
		}
		scanner.close();
		System.out.println("Program finished, have a good day!");
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
		int subMenuOption = 1;
		for(Course course: universityController.getUniversity().getCollegeCourses())
		{
			System.out.println(subMenuOption + ". " + course);
			subMenuOption += 1;
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
