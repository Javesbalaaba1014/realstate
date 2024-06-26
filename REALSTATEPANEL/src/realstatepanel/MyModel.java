package realstatepanel;


import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public MyModel (){}
    
    public MyModel(Object[][] data,String [] colomnsName ){
        this.columns = colomnsName;
        this.rows = data;
        
    }
    
    @Override
    public Class getColumnClass(int col){
//        if (col == 7){return Icon.class;}
//        else{
//            return getValueAt(0, col).getClass();
//        }
                if (col == 7) {
                return Icon.class;
            } else {
                Object value = getValueAt(0, col);
                return value != null ? value.getClass() : Object.class;
            }
    }
    
    public Class getColumnClasshousing(int col){
//        if (col == 7){return Icon.class;}
//        else{
//            return getValueAt(0, col).getClass();
//        }
                if (col == 11) {
                return Icon.class;
            } else {
                Object value = getValueAt(0, col);
                return value != null ? value.getClass() : Object.class;
            }
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
}