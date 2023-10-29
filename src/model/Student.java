package model;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.id = (int)(100000 * Math.random());
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Id: " + this.id + " Name: " + this.name + " Age: " + age + " years old.";
	}
}
