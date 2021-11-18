package formationProject.services;

import java.util.ArrayList;
import java.util.List;

import formationProject.models.Formation;
import formationProject.models.Student;

public class StudentsServices {
	
	private static StudentsServices instances = null;
		
		private List<Student> students = new ArrayList<Student>();
		
		
		private StudentsServices() {
			
//			for (int i = 1; i <= 12; i++) {
//				Formation formation;
//				students.add(new Student("John" + i, "Doux" + i, 22, 15, ));
//			}
		}
		
		public static StudentsServices getInstance() {
			if (StudentsServices.instances == null) {
				StudentsServices.instances = new StudentsServices();
			}
			return instances;
		}
		
		public List<Student> getStudents() {
			return this.students;
		}
		
		public Student getStudentByName(Student student) {
			Student response = null;
			
			for (Student student : students) {
				if (student.equals(student)) {
					response = student;
					break;
					
				}
			}
			return response;
		}
}
