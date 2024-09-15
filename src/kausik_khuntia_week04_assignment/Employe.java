package kausik_khuntia_week04_assignment;
import java.util.HashMap;

public class Employe {

	
	    private String name;
	    private String department;

	    public Employe(String name, String department) {
	        this.name = name;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return "Employee [Name=" + name + ", Department=" + department + "]";
	    }
	}

	 class EmployeManager {
	    private HashMap<Integer, Employe> employes;

	    public EmployeManager() {
	        employes = new HashMap<>();
	    }

	    // Add employee
	    public void addEmployee(int id, String name, String department) {
	        employes.put(id, new Employe(name, department));
	        System.out.println("Employee added: " + name);
	    }

	    // Retrieve employee by ID
	    public void getEmployee(int id) {
	        Employe emp = employes.get(id);
	        if (emp != null) {
	            System.out.println("Employee details: " + emp);
	        } else {
	            System.out.println("Employee not found with ID: " + id);
	        }
	    }

	    public static void main(String[] args) {
	        EmployeManager em = new EmployeManager();
	        em.addEmployee(201, "Charlie", "HR");
	        em.addEmployee(202, "David", "Finance");
	        em.getEmployee(201);
	        em.getEmployee(203);  // Employee with this ID does not exist
	    }
	}



