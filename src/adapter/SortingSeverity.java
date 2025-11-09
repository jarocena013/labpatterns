package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SortingSeverity implements Comparator<Object> {
	@Override
	public int compare(Object s1, Object s2) {
		return Integer.compare(((Symptom)s1).getSeverityIndex(), ((Symptom)s2).getSeverityIndex());
	}

}
