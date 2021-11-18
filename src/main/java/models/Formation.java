package models;

public class Formation {
	private String title;
	private String program;
	private int nbStudents;
	
	public Formation(String title, String program, int nbStudents) {
		this.setTitle(title);
		this.setProgram(program);
		this.setNbStudents(nbStudents);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getNbStudents() {
		return nbStudents;
	}

	public void setNbStudents(int nbStudents) {
		this.nbStudents = nbStudents;
	}
	
	
}
