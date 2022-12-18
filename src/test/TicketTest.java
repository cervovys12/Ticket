package test;

import org.junit.Test;

import main.Item;

public class TicketTest {
	
    @Test
    public void HelloWorld() {
    	 System.out.println("-------Iteration 1 -----------");
    	 System.out.println("ID 1 ");
       System.out.println("Hello World");
      
      
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