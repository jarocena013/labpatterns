package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory fs= new SymptomFactory();
		Observable	pacient=new	Covid19Pacient("aitor",	35,fs);	
		new	PacientObserverGUI	(pacient);	
		new	PacientSymptomGUI	((Covid19Pacient) pacient);	
		Observable	pacient2=new	Covid19Pacient("mikel",	38,fs);	
		new	PacientObserverGUI	(pacient2);	
		new	PacientSymptomGUI	((Covid19Pacient) pacient2);	
	}


}
