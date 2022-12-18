package main;

import java.util.Scanner;

public class Item {

	
	private String nom;
	private int quantite;
	private float prixUnitaire;

	public Item(String nom, int quantite, float prixUnitaire){
	    this.nom= nom;
	    this.quantite = quantite;
	    this.prixUnitaire = prixUnitaire;
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
	    return " "+getNom()+" "+getUnite()+" "+ getPrixUnitaire()+" "+getPrixTotal();
	}
	
	


}
