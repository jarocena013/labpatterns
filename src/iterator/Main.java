package iterator;

import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Covid19PacientInvertedIteratorAdapter;
import adapter.Sorting;
import adapter.SortingName;
import adapter.SortingSeverity;
import domain.Covid19Pacient;
import domain.DigestiveSymptom;
import domain.Symptom;
import factory.SymptomFactory;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29, new SymptomFactory());
			p.addSymptom(new DigestiveSymptom("s1", 10, 20), 1);
			p.addSymptom(new DigestiveSymptom("s2", 10, 10), 2);
			p.addSymptom(new DigestiveSymptom("s3", 10, 10), 3);
			p.addSymptom(new DigestiveSymptom("s4", 10, 10), 4);
			p.addSymptom(new DigestiveSymptom("s5", 10, 10), 5);
			
			System.out.println("Hasierako ordena");
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			
			System.out.println("\nIzenaren bidez ordenatuta");
			Iterator i2 = Sorting.sortedIterator(new Covid19PacientInvertedIteratorAdapter(p), new SortingName());
			while(i2.hasNext())
				System.out.println(i2.next());
			
			System.out.println("\nLarritasunaren bidez ordenatuta");
			Iterator i3 = Sorting.sortedIterator(new Covid19PacientInvertedIteratorAdapter(p), new SortingSeverity());
			while(i3.hasNext())
				System.out.println(i3.next());

		}

	}

