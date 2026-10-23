package adapter2;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  return "value";
	  }
	}
