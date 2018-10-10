
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascal
 */
public class VelocityTableRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        int col = table.convertColumnIndexToModel(column);
        double ue = (double) value;
        if(col == 4)
        {
           if(ue <= 10)
           {
               setBackground(Color.cyan);
           }
           else if(ue > 10 && ue <= 20)
           {
               setBackground(Color.yellow);
           }
           else if(ue > 20 && ue <= 30)
           {
               setBackground(Color.orange);
           }
           else
           {
               setBackground(Color.red);
           }
        }
        return comp;
    }
}
