package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {
	private Iterator iterator;
	private Covid19Pacient pacient;
	
	public Covid19PacientInvertedIteratorAdapter(Covid19Pacient p) {
		this.pacient=p;
		this.iterator=p.iterator();
	}

	@Override
	public Object previous() {
		return iterator.next();
	}

	@Override
	public boolean hasPrevious() {
		return iterator.hasNext();
	}

	@Override
	public void goLast() {
		// Hasierara joan
		this.iterator=pacient.iterator();
	}

}