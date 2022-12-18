package test;

import main.Item;
import org.junit.Test;

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
}
