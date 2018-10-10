
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascal
 */
public class VelocityTableModel extends AbstractTableModel{
    
    private ArrayList<Measurement> messungen = new ArrayList<>();
    private static final String COLNAMES[] = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"};

    
    @Override
    public int getRowCount() {
        return messungen.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Measurement m = messungen.get(row);
        try {
            switch (col) {
                case 0:
                    return m.getDate();
                case 1:
                    return m.getTime();
                case 2:
                    return m.getKennzeichen();
                case 3:
                    return m.getGemessen();
                case 4:
                    return m.getErlaubt();
                case 5:
                    return m.getUebertretung();
                default:
                    System.out.println("Fehler");
            }
        } catch (Exception e) {
            System.out.println("Fehler: " + e.toString());
        }
        return true;
    }
    
    @Override
    public String getColumnName(int i) {
        return COLNAMES[i]; //To change body of generated methods, choose Tools | Templates.
    }
   
    public void add(Measurement m)
    {
        messungen.add(m);
        fireTableRowsInserted(messungen.size()-1, messungen.size()-1);
    }
    
    public void remove(int i) {
        messungen.remove(i);
        this.fireTableRowsDeleted(i, i);
    }
    
    public double averageGemessen() {
        double average = messungen.stream().mapToDouble(Measurement::getGemessen).average().getAsDouble();
        return average;
    }
}
