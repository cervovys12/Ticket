package test;

import main.Commande;
import main.Item;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TicketTest {
    private static final double DELTA = 1e-15;

    @Test
    public void HelloWorld() {
       System.out.println("Hello World");
    }
    @Test
    public void showItemInformation() {
        float prixUnitaire = 3;
        int quantite = 2;
        Item item = new Item("Tacos", quantite, prixUnitaire);
        assertEquals(item.getPrixTotal(),quantite * prixUnitaire,DELTA);
        System.out.println(item.toString());
    }
    @Test
    public void CommandeIsValidated() {
        Commande commande = new Commande();
        Item item = new Item("Pepsi", 4, 2);
        commande.addItem(item);
        commande.ValidateCommande(true);
    }
    @Test
    public void CommandeIsNotValidated() {
        Commande commande = new Commande();
        Item item = new Item("Pepsi", 4, 2);
        commande.addItem(item);
        commande.ValidateCommande(false);
        Item item2 = new Item("pizza", 4, 4);
        commande.addItem(item2);
        commande.showItems();
    }
    @Test
    public void showTotalPriceWithoutTax() {
        Commande commande = new Commande();
        Item item = new Item("Pepsi", 4, 2);
        commande.addItem(item);
        Item item2 = new Item("pizza", 4, 4);
        commande.addItem(item2);
        commande.ValidateCommande(true);
    }
    
    @Test 
    public void showReductionValue()
    {
    	
    	//ETANT DONNE une commande
    	Commande commande =new Commande();
    	
    	//ALORS afficher le prix de reduction fixé à 0€
    	
    	System.out.println("Prix réduction : "+commande.getReductionValue()+ " €");
    }
}
