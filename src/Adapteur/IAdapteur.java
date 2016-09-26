package Adapteur;

import modele.Item;
import modele.ModeleData;

public interface IAdapteur {
	
	public void addItem(Item i);
	
	public void removeItem(Item i);
	
	public ModeleData getModele();

	public void setModele(ModeleData modele);
	
	public void notifyView();


}
