package view;

import javax.swing.table.AbstractTableModel;
import modele.ModeleData;

public class TableModele extends AbstractTableModel{
	
	private ModeleData modele;
	
	private String[] m_colNames = {"Nom", "Montant", "Description"};
	
    public TableModele(ModeleData modele) {
		super();
		this.modele = modele;
	}
    
    @Override
	public int getColumnCount() {
      return m_colNames.length;
      //return 3;
    }
	
	@Override
    public int getRowCount() {
		//System.out.println(items.size());
      return modele.items.size();
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
    	
      switch (col) {
      case 0:
        modele.getItems().get(row).setNom((String) value);
        break;
      case 1:
    	  modele.getItems().get(row).setMontant(Float.parseFloat((String)value));
        break;
      case 2:
        modele.getItems().get(row).setDescription((String) value);
        break;
      }
    }

    @Override
    public String getColumnName(int col) {
      return m_colNames[col];
    }
    
    @Override
    public Object getValueAt(int row, int col) {
      

      switch (col) {
      case 0:
        return modele.getItems().get(row).getNom();
      case 1:
        return modele.getItems().get(row).getMontant();
      case 2:
        return modele.getItems().get(row).getDescription();
      }

      return new String();
    }
    
    @Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0:
			case 1:
				return String.class;
	
			case 3:
				return Integer.class;
	
			case 2:
				return String.class;
	
			default:
				return Object.class;
		}
	}
    
    @Override
    public boolean isCellEditable(int i,int i1){
        return true;
}
    

}