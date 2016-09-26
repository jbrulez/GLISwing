package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.ItemSelectable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JComponent;

import Adapteur.Adptateur;
import modele.IModeleData;
import modele.Item;
import modele.ModeleData;

public class Vue extends JComponent implements MouseListener{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private IModeleData modele;
	private Adptateur adapteur;
	private List<FabricationQuartier> quartiers = new ArrayList<FabricationQuartier>();
	private String total;
	private TableModele table;
	private Item item;
	
	Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
	Arc2D.Float arc1 = new Arc2D.Float(Arc2D.PIE);
	Arc2D.Float arc2 = new Arc2D.Float(Arc2D.PIE);

	
	//Constructeur de la classe
	public Vue(IModeleData modele) {
		this.modele = modele;
		this.addMouseListener(this);
	}
	
	public Vue(IModeleData modele, TableModele table) {
		this.modele = modele;
		this.addMouseListener(this);
		this.table = table;
	}
	
	public List<FabricationQuartier> getQuartiers() {
		return quartiers;
	}


	public void setQuartiers(List<FabricationQuartier> quartiers) {
		this.quartiers = quartiers;
	}


	//Methode PaintComponent
	public void paintComponent(Graphics g){
		 
		Graphics2D g2 = (Graphics2D) g; 
		float start = 0;
		float extent = 0;
		
		for ( Item i : modele.getItems()){
			
			Random randomGenerator = new Random();
			int red = randomGenerator.nextInt(255);
			int green = randomGenerator.nextInt(255);
			int blue = randomGenerator.nextInt(255); 
			Color randomColour = new Color(red,green,blue);
		
			extent = 360 * i.getMontant() / modele.getTotalValeurItem();
			
			//constructeur de la classe quartier
			FabricationQuartier quartier = new FabricationQuartier(start, extent, i);
			quartiers.add(quartier);

		    g2.setColor(randomColour);
		    g2.fill(quartier);
		    
		    start += 360 * i.getMontant() / modele.getTotalValeurItem();
			
		}
		
		// Arc milieu
	      arc1.setFrame(125, 125, 300, 300);
	      arc1.setAngleStart(0);
	      arc1.setAngleExtent(360);
	      Graphics2D g3 = (Graphics2D) g; 
	      g3.setColor(Color.white);
	      g3.fill(arc1);
	      g3.setColor(Color.black);
	      Font font1 = new Font("Serif", Font.PLAIN, 24);
	      g3.setFont(font1);
	      
	    //First arc  
	      arc2.setFrame(175, 175, 200, 200);
	      arc2.setAngleStart(0);
	      arc2.setAngleExtent(360);
	      Graphics2D g4 = (Graphics2D) g; 
	      g4.setColor(Color.gray);
	      g4.fill(arc2);
	      g4.setColor(Color.black);
	      Font font2 = new Font("Serif", Font.PLAIN, 24);
	      g2.drawString("Budget", 230, 270);
	      g2.drawString("TOTAL : " + modele.getTotalValeurItem() + "€", 200, 300);
	      g4.setFont(font2);
		
	}
	
	
	public void mouseClicked(MouseEvent e) { 
		
		for (FabricationQuartier q : quartiers){
			if (q.contains(e.getX(), e.getY())){
				System.out.println("ceci est un click!!!");
			}
		
			else
				System.out.println("");
	}
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	 static double computeAngle(double total,double data){
	        return 360*data/total;
	}
	 
		
		public String getTitre() {
			return this.modele.getName();
		}

		
		public List<Item> getItems() {
			// TODO Auto-generated method stub
			return this.modele.getItems();
	}

		
		public void notifierVue() {
			getData();
		}

		
		public void getData() {
			getTitre();
			getItems();
	}
		
		public void callRepaint() {
			this.repaint();
	}
		
		public float getValeurTotaldesItems() {
			return this.modele.getTotalValeurItem();
		}
		
		public void setTitre(String titre) {
			this.modele.setName(titre);
			
	}
	

}
