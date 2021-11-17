package formationProject.services;

import java.util.ArrayList;
import java.util.List;

import formationProject.models.Formation;

public class FormationsServices {

	private static FormationsServices instances = null;
	
	private List<Formation> formations = new ArrayList<Formation>();
	
	
	private FormationsServices() {
		
		for (int i = 1; i <= 12; i++) {
			formations.add(new Formation("Formation" + i, "This is the program" + i, 22));
		}
	}
	
	public static FormationsServices getInstance() {
		if (FormationsServices.instances == null) {
			FormationsServices.instances = new FormationsServices();
		}
		return instances;
	}
	
	public List<Formation> getFormations() {
		return this.formations;
	}
	
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
}
