package iterator;


import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Covid19PacientModelAdapter implements InvertedIterator {
	private Covid19Pacient pacient;
	private List<Symptom> symptoms;
	private int position;

	public Covid19PacientModelAdapter(Covid19Pacient p) {
		this.pacient = p;
		this.symptoms = new ArrayList<>();
		
		// Pazientearen sintomak eskuratu eta listan gorde
		Iterator<Symptom> it = pacient.iterator();
		while (it.hasNext()) {
			symptoms.add(it.next());
		}
		this.position = symptoms.size() - 1;
	}

	@Override
	public void goLast() {
		this.position = symptoms.size() - 1;
	}

	@Override
	public boolean hasPrevious() {
		return this.position >= 0;
	}

	@Override
	public Object previous() {
		if (hasPrevious()) {
			Symptom s = symptoms.get(position);
			position--;
			return s;
		}
		return null;
	}
}
