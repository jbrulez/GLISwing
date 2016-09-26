package Adapteur;

import java.util.List;

import modele.IModeleData;
import modele.Item;
import modele.ModeleData;
import view.Vue;
import view.VueTable;

public class Adptateur implements IAdapteur, IModeleData{
	
	private ModeleData modele;
	private Vue vue;
	private VueTable vueTable;

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

	public void setModele(ModeleData modele, Vue vue, VueTable vueTable) {
		this.modele = modele;
		this.vue = vue;
		this.vueTable = vueTable;
	}

	public Adptateur(ModeleData modele, Vue vue, VueTable vueTable) {
		super();
		this.modele = modele;
		this.vue = vue;
		this.vueTable = vueTable;
	}

	public Vue getVue() {
		return vue;
	}

	public void setVue(Vue vue) {
		this.vue = vue;
	}

	public VueTable getVueTable() {
		return vueTable;
	}

	public void setVueTable(VueTable vueTable) {
		this.vueTable = vueTable;
	}

	public void setModele(ModeleData modele) {
		this.modele = modele;
	}

	public void notifierVue() {
		this.vue.notifierVue();
}

	@Override
	public String getName() {
		return modele.getName();
	}

	@Override
	public void setName(String name) {
		modele.setName(name);
		
	}

	@Override
	public List<Item> getItems() {
		return modele.getItems();
	}

	@Override
	public void setItem(List<Item> item) {
		modele.setItem(item);
		
	}

	@Override
	public float getTotalValeurItem() {
		return modele.getTotalValeurItem();
	}

	@Override
	public void setTotalValeurItem(float totalValeurItem) {
		modele.setTotalValeurItem(totalValeurItem);
		
	}

	public void callRepaint() {
		this.vue.callRepaint();
	}

	@Override
	public void notifyView() {
		// TODO Auto-generated method stub
		
	}
}
