package modele;

public class Item {
	
	private String nom;
	private float montant;
	private String description;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription (){
		return description;
	}
	
	public float getMontant() {
		return montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Item(String nom, float montant, String description) {
		super();
		this.nom = nom;
		this.montant = montant;
		this.description = description;
	}

	public Item() {
		super();
	}
	
	

}
