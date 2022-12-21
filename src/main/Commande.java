package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commande {

	private List<Item> items = new ArrayList<>();
	private float prixTotaleSansTaxes=0f;
	
    private float reductionValue=0f;
	

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void ValidateCommande(boolean isValidated) {
		if(isValidated) {
			showItems();
			System.out.println(getPrixTotaleSansTaxes());
		}
		else {
			addNewItem();
		}
	}
	public void showItems() {
		for (Item item: items) {
			System.out.println(item.toString());
		}
	}
	public void addNewItem() {
		System.out.println("ajouter un nouveau article");
	}
	public float getPrixTotaleSansTaxes() {

		for (Item item : items) {
			prixTotaleSansTaxes += item.getPrixTotal();
		}
		return prixTotaleSansTaxes;
	}
	
	public float getReductionValue() {
		return reductionValue;
	}
	
	
}