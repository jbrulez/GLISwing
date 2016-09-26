package view;

import javax.swing.JPanel;
import javax.swing.JTable;

import modele.ModeleData;

public class VueTable extends JTable{
	
	/**
	 * Create by Jimmy BRULEZ
	 */
	private static final long serialVersionUID = 1L;
	
	private ModeleData modele = new ModeleData();
	private TableModele tableModele = new TableModele(modele);
	
	public ModeleData getModele() {
		return modele;
	}
	
	public void setModele(ModeleData modele) {
		this.modele = modele;
	}
	
	public TableModele getTableModele() {
		return tableModele;
	}
	
	public void setTableModele(TableModele tableModele) {
		this.tableModele = tableModele;
	}
	
	public VueTable(ModeleData modele, TableModele tableModele) {
		super();
		this.modele = modele;
		this.tableModele = tableModele;
	}
	
	public VueTable() {
		super();
	}
	

}
