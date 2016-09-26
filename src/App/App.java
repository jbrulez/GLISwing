package App;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.ScrollPane;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import Adapteur.Adptateur;
import controller.Controller;
import modele.IModeleData;
import modele.Item;
import modele.ModeleData;
import view.TableModele;
import view.Vue;
import view.VueTable;

public class App {

	public static void main(String[] args) {
		
		IModeleData modele = new ModeleData();
		ModeleData mod = new ModeleData();
		VueTable vTable = new VueTable();
		System.out.println();
		
	
		Item item1 = new Item("Loyer",500, "Loyer + Charges");
		Item item2 = new Item("Assurances", 66, "Auto + Habitation");
		Item item3 = new Item("Course", 60, "Course semaine x");
		Item item4 = new Item("Sorties", 80, "Sorties totale du mois");
		
		modele.addItem(item1);
		modele.addItem(item2);
		modele.addItem(item3);
		modele.addItem(item4);
		
		Vue vue = new Vue(modele);
		TableModele tableModele = new TableModele((ModeleData) modele);
		
		Adptateur adaptateur = new Adptateur(mod, vue, vTable);
		Controller controller = new Controller(adaptateur);
		
		JFrame fenetre = new JFrame();
		JFrame tableau = new JFrame();
		JTable tablej = new JTable(tableModele);
		
		JPanel graphiqueT = new JPanel();
		JPanel tableData = new JPanel();

		fenetre.setTitle("GLI TP1");
		fenetre.setSize(600,500);
		fenetre.setResizable(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		
		tableau.setTitle("GLI Table");
		tableau.setSize(300,300);
		tableau.setResizable(true);
		tableau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableau.setLocationRelativeTo(null);
	
		tableau.getContentPane().add((new JScrollPane(tablej)));
		
		tableau.pack();
		fenetre.getContentPane().add(vue);
		fenetre.setVisible(true);
		tableau.setVisible(true);
		
		
	}
}

