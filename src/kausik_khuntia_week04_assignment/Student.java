package kausik_khuntia_week04_assignment;
import java.util.ArrayList;

public class Student {

	
	    private String name;
	    private int id;

	    public Student(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return "Student [ID=" + id + ", Name=" + name + "]";
	    }
	}

	 class StudentManager {
	    private ArrayList<Student> students;

	    public StudentManager() {
	        students = new ArrayList<>();
	    }

	    // Add a student
	    public void addStudent(String name, int id) {
	        students.add(new Student(name, id));
	        System.out.println("Student added: " + name);
	    }

	    // Remove a student by ID
	    public void removeStudent(int id) {
	        students.removeIf(student -> student.getId() == id);
	        System.out.println("Student with ID " + id + " removed.");
	    }

	    // Display all students
	    public void displayStudents() {
	        System.out.println("Student List:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }

	    public static void main(String[] args) {
	        StudentManager sm = new StudentManager();
	        sm.addStudent("Kausik", 101);
	        sm.addStudent("Kumar", 102);
	        sm.displayStudents();
	        sm.removeStudent(101);
	        sm.displayStudents();
	    }
	}



