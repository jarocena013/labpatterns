package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35,new SymptomFactory());
		new	PacientObserverGUI	(pacient);
		//new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI	(pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		/*Observable	pacient2=new	Covid19Pacient("jon",	45,new SymptomFactory());
		//new	PacientObserverGUI	(pacient2);
		new	PacientObserverGUI	(pacient2);
		new	PacientSymptomGUI	(pacient2);
		new PacientThermometerGUI(pacient2);
		Observable	pacient3=new	Covid19Pacient("mikel",	60,new SymptomFactory());
		//new	PacientObserverGUI	(pacient2);
		new	PacientObserverGUI	(pacient3);
		new	PacientSymptomGUI	(pacient3);
		new PacientThermometerGUI(pacient3);
		*/
		

	}


}
