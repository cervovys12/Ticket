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
	public void showTotalPriceItem() {
		System.out.println("ID 2");
		// ETANT DONNE un article
		// QUAND je saisie une quantite et un prix unitaire
		float prixUnitaire = 3;
		int quantite = 2;
		Item item = new Item("Tacos", quantite, prixUnitaire);
		// ALORS afficher le prix total

		System.out.println(item.toString());

	}

	@Test
	public void CommandeIsValidated() {
		System.out.println("ID 3");
		// ETANT DONNE une commande ayant déjà un article
		Commande commande = new Commande();
		Item item = new Item("Pepsi", 4, 2);
		commande.addItem(item);
		// QUAND on le valide
		commande.setIsValidated(true);
		// ALORS une question proposant de saisir un nouveau article est proposée
		System.out.println("Voulez-vous ajouter un autre article ?  NON ");
		// ET repondre non
		// Afficher le premier article
		System.out.println("Liste des articles ");
		commande.showItems();

	}

	@Test
	public void CommandeIsNotValidated() {
		System.out.println("ID 3");
		// ETANT DONNE une commande ayant déjà un article
		Commande commande = new Commande();
		Item item = new Item("Pepsi", 4, 2);
		commande.addItem(item);
		// QUAND on le valide
		commande.setIsValidated(false);
		// ALORS une question proposant de saisir un nouveau article est proposée
		System.out.println("Voulez-vous ajouter un autre article ?  Oui ");
		// ET repondre oui
		Item item2 = new Item("pizza", 4, 4);
		commande.addItem(item2);

		System.out.println("Liste des articles ");
		commande.showItems();

	}

	@Test
	public void showItemDesignation() {
		System.out.println("ID 18");
		// ETANT DONNE un article
		// QUAND je saisie une quantite , un prix unitaire et une designation
		float prixUnitaire = 3;
		int quantite = 2;
		String designation = "Tc";
		Item item = new Item("Tacos", quantite, prixUnitaire);
		item.setDesignation(designation);
		// ALORS afficher le prix total

		System.out.println("Designation :" + item.getDesignation());

	}

}
