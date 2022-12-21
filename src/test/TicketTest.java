package test;

import org.junit.Test;

import main.Commande;
import main.Item;


public class TicketTest {
	
    @Test
    public void HelloWorld() {
    	 System.out.println("-------Iteration 1 -----------");
    	 System.out.println("ID 1 ");
       System.out.println("Hello World");
      
      
    }
	@Test
	public void showTotalPriceWithOutTaxt() {
		System.out.println("ID 4");
		// ETANT DONNE une commande ayant déjà un article
		Commande commande = new Commande();
		Item item = new Item("Pepsi", 4, 2);
		commande.addItem(item);
		Item item2 = new Item("Pizza", 8, 2);
		commande.addItem(item2);
		// QUAND on le valide
		commande.setIsValidated(true);
		// ALORS une question proposant de saisir un nouveau article est proposée
		System.out.println("Voulez-vous ajouter un autre article ?  NON ");
		// ET repondre non
		// Afficher le premier article
		System.out.println("Liste des articles ");
		commande.showItems();
		System.out.println("Prix Tolal Commande : "+commande.getPrixTotaleSansTaxes());

	}
    @Test
    public void showTotalPriceItem() {
    	System.out.println("ID 2");
    	//ETANT DONNE un article 
    	//QUAND je saisie une quantite et un prix unitaire 
        float prixUnitaire = 3;
        int quantite = 2;
        Item item = new Item("Tacos", quantite, prixUnitaire);
        //ALORS afficher le prix total
        
        System.out.println(item.toString());
        
    }
   
}

