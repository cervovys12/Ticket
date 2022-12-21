package main;


public class Item {

	
	private String nom;
	private int quantite;
	private float prixUnitaire;
	private String designation;

	public Item(String nom, int quantite, float prixUnitaire){
	    this.nom= nom;
	    this.quantite = quantite;
	    this.prixUnitaire = prixUnitaire;
	    this.designation=null;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}
	public String getNom(){
	    return this.nom;
	}

	public int getUnite(){
	    return this.quantite;
	}
	

	public float getPrixUnitaire(){
	    return this.prixUnitaire;
	}

	public float getPrixTotal(){
	    return this.getPrixUnitaire() * this.getUnite();
	}

	
	public String toString(){
	    return "Nom: "+getNom()+"\nQuantité : "+getUnite()+"\nPrix Unitaire :"+ getPrixUnitaire()+"\nPrix Total :"+getPrixTotal();
	}

}
