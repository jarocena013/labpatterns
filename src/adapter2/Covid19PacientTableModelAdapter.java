package adapter2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    return columnNames.length;
	  }

	  public String getColumnName(int i) {
		  return columnNames[i];
	  }

	  public int getRowCount() {
		 return this.pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    
		  Symptom s= new ArrayList<>(this.pacient.getSymptoms()).get(row);
		  if(col==0) return s;
		  else if(col==1) return this.pacient.getWeight(s);
		  return null;
		  
	  }
	}
