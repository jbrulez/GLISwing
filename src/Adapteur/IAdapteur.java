package Adapteur;

import java.util.List;

import modele.Item;
import modele.ModeleData;
import view.Vue;
import view.VueTable;

public interface IAdapteur {
	
	public void addItem(Item i);
	
	public void removeItem(Item i);
	
	public ModeleData getModele();
	
	public Vue getVue();
	
	public void setVue(Vue vue);
	
	public VueTable getVueTable();
	
	public void setVueTable(VueTable vueTable);
	
	public void setModele(ModeleData modele);
	
	public void notifyView();
	
	public String getName();
	
	public void setName(String name);
	
	public List<Item> getItems();
	
	public void setItem(List<Item> item);
	
	public float getTotalValeurItem();
	
	public void setTotalValeurItem(float totalValeurItem);
	
	public void callRepaint();


}
