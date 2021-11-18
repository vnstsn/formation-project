package models;

public class Student {
	private String name;
	private String firstName;
	private int age;
	private int note;
	private Formation formation;
	
	public Student(String name, String firstName, int age, int note, Formation formation) {
		this.setName(name);
		this.setFirstName(firstName);
		this.age = (age);
		this.setNote(note);
		this.setFormation(formation);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	
	
}
