package services;

import java.util.ArrayList;
import java.util.List;

import models.Formation;
import models.Student;

public class FormationsServices {

	// init for instance
	private static FormationsServices instances = null;
	// create an empty list for formations
	private List<Formation> formations = new ArrayList<Formation>();
	// same for students
	private List<Student> students = new ArrayList<Student>();
	
	private FormationsServices() {
		// list of formations
		for (int i = 1; i <= 12; i++) {
			formations.add(new Formation("Formation" + i, "This is the program" + i, i+12));
		}
		
		// list of students
		for (int i = 0; i <= 20; i++) {
			students.add(new Student("name" + i, "firstname" + i, i, i, formations.get(i) ));
		}
	}
	
	// to get instance
	public static FormationsServices getInstance() {
		if (FormationsServices.instances == null) {
			FormationsServices.instances = new FormationsServices();
		}
		return instances;
	}
	
	public List<Formation> getFormations() {
		return this.formations;
	}
	
	public List<Student> getStudents() {
		return this.students;
	}
	
	// to get a formation by its title
	public Formation getFormationByName(String title) {
		Formation response = null;
		for (Formation formation : formations) {
			if (formation.getTitle().equals(title)) {
				response = formation;
				break;
				
			}
		}
		return response;
	}
	
	// to get a student with name & firstname
	public Student getStudentByName(String name, String firstname) {
		Student response = null;
		
		for (Student student : students) {
			if (student.getName().equals(name) && student.getFirstName().equals(firstname)) {
				response = student;
				break;
				
			}
		}
		return response;
	}
}
