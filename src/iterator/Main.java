package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory fs = new SymptomFactory();
		Covid19Pacient p = new Covid19Pacient("Ane", 29, fs);
		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 6), 2);
		p.addSymptom(new Symptom("s3", 10, 2), 3);
		p.addSymptom(new Symptom("s4", 10, 8), 4);
		p.addSymptom(new Symptom("s5", 10, 4), 5);

		Covid19PacientModelAdapter adapter1 = new Covid19PacientModelAdapter(p);

		System.out.println("=== 1. Sintoma izenaren arabera ordenatuta (SymptomNameOrdenatu) ===");
		Iterator<Symptom> sortedByName = Sorting.sortedIterator(adapter1, new SymptomNameOrdenatu());
		while (sortedByName.hasNext()) {
			System.out.println(sortedByName.next());
		}

		Covid19PacientModelAdapter adapter2 = new Covid19PacientModelAdapter(p);

		System.out.println("\n=== 2. Larritasun indizearen arabera ordenatuta (SeverityIndexOrdenatu) ===");
		Iterator<Symptom> sortedBySeverity = Sorting.sortedIterator(adapter2, new SeverityIndexOrdenatu());
		while (sortedBySeverity.hasNext()) {
			System.out.println(sortedBySeverity.next());
		}

	}

}
