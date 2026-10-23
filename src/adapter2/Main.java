package adapter2;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory fs = new SymptomFactory();
		Covid19Pacient pacient = new Covid19Pacient("aitor", 35, fs);

		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);

		ShowPacientTableGUI gui = new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);

		Covid19Pacient pacient2 = new Covid19Pacient("mikel", 38, fs);

		pacient2.addSymptomByName("mareos", 2);
		pacient2.addSymptomByName("diarrea", 1);

		ShowPacientTableGUI gui2 = new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
	}

}
