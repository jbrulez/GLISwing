package Adapteur;

import java.util.List;

import modele.IModeleData;
import modele.Item;
import modele.ModeleData;
import view.Vue;

public class Adptateur implements IAdapteur, IModeleData{
	
	private ModeleData modele;
	private Vue vue;

	@Override
	public void addItem(Item i) {
		modele.addItem(i);
		notifyView();
	}

	@Override
	public void removeItem(Item i) {
		modele.removeItem(i);
		notifyView();
		
	}

	public ModeleData getModele() {
		return modele;
	}

	public void setModele(ModeleData modele) {
		this.modele = modele;
	}

	public Adptateur(ModeleData modele, Vue vue) {
		super();
		this.modele = modele;
		this.vue = vue;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		notifyView();
		
	}

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItem(List<Item> item) {
		// TODO Auto-generated method stub
		notifyView();
	}

	@Override
	public float getTotalValeurItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTotalValeurItem(float totalValeurItem) {
		// TODO Auto-generated method stub
		notifyView();
	}

	@Override
	public void notifyView() {
		// TODO Auto-generated method stub
		vue.repaint();
		
	}

}
