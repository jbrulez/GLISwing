package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Adapteur.Adptateur;
import Adapteur.IAdapteur;
import modele.Item;
import view.Vue;
import view.VueTable;

public class Controller{

	private Adptateur adapteur;
	private Vue vue;
	private VueTable vueTable;
	
	/*Initialisation des données
	 * La fonction listener est faite dans la classe Vue directements
	 */
	public Controller(Adptateur adapteur) {
		super();
		this.adapteur = adapteur;
		
		this.vue = this.adapteur.getVue();
		this.vueTable = this.adapteur.getVueTable();
	}


}
