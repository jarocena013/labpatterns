package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SortingName implements Comparator<Object> {
	@Override
	public int compare(Object s1, Object s2) {
		return ((Symptom)s1).getName().compareTo(((Symptom)s2).getName());
	}

}
