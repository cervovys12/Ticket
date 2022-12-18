package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commande {

	private List<Item> items = new ArrayList<>();
	private float prixTotaleSansTaxes=0f;
	private float TCCPrice = 0f;
	private Map<String,Double> tva=new HashMap<>();

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
	public void inittaux()
	{
		tva.put("Fr", 0.2);
		tva.put("Gn", 0.1);
		tva.put("Ma", 0.3);
	}
	
	public float getTTCPrice(float ttva) {
		TCCPrice=getPrixTotaleSansTaxes()+ttva;
		return TCCPrice;
	}
	
}