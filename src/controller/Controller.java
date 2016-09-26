package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Adapteur.IAdapteur;
import modele.Item;

public class Controller implements IController{
	
	private IAdapteur adapteur;

	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		adapteur.addItem(item);
		
	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		adapteur.removeItem(item);
		
	}


}
