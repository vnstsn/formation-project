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
			formations.add(new Formation("Formation" + i, "This is the program" + i, i));
		}
		
		// list of students
		for (Formation formation : formations) {
			for (int i = 1; i < 3; i++) {
				students.add(new Student("Name" + i, "Firstname" + i, 10 + i,  10 + i, formation));
			}
		}
		
	}
	
	// to get instanc
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
	
	// to get a student with name
	public Student getStudentByName(String name) {
		Student response = null;
		
		for (Student student : students) {
			if (student.getName().equals(name)) {
				response = student;
				break;
				
			}
		}
		return response;
	}
}
