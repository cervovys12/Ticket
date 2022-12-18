package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commande {

	private List<Item> items = new ArrayList<>();

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void ValidateCommande(boolean isValidated) {
		if(isValidated) {
			showItems();
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
}