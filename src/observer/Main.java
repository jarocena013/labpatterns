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
		new PacientThermometerGUI ((pacient));
		new SemaphorGUI(pacient);
		/*
		Observable	pacient2=new	Covid19Pacient("mikel",	38,fs);	
		new	PacientObserverGUI	(pacient2);	
		new	PacientSymptomGUI	((Covid19Pacient) pacient2);
		new PacientThermometerGUI ((pacient2));
		Observable	pacient3=new	Covid19Pacient("jon",	40,fs);	
		new	PacientObserverGUI	(pacient3);	
		new	PacientSymptomGUI	((Covid19Pacient) pacient3);
		new PacientThermometerGUI ((pacient3));
		*/
	}


}
