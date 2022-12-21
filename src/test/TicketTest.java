package test;

import org.junit.Test;

import main.Commande;

public class TicketTest {
    @Test
    public void HelloWorld() {
       System.out.println("Hello World");
    }

    
    @Test
    public void ShowTaxList() {
    	
    	System.out.println("ID 6");
    	//ETANT DONNE au demarrage du programme
        Commande commande = new Commande();
        commande.inittaux();
        
        //ALORS afficher liste des codes tva 
        //Ma= Maroc, Gn=Guinee, Fr=France
        
        
        System.out.println("Liste des TVA");
        for (String name: commande.getTva().keySet()) {
            String key = name.toString();
            String value = commande.getTva().get(name).toString();
            System.out.println(key + " " + value);
        }
    }

}
