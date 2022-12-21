package test;

import org.junit.Test;

import main.Commande;

public class TicketTest {

	@Test
	public void showReductionList() {
		System.out.println("ID 11\n LISTE DES REDUCTIONS POSSIBLES");
		Commande commande = new Commande();
		for (Integer reduction : commande.getReductionList()) {
			System.out.println(reduction + "%");
		}
	}

}
