package main;
import java.util.ArrayList;
import java.util.List;

public class Commande {

	private List<Item> items = new ArrayList<>();
	private float prixTotaleSansTaxes=0f;
	private boolean isValidated=false;


	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

    
	public void setIsValidated(boolean value)
	{
		this.isValidated=value;
	}
	
	public void showItems() {
		int cp=1;
		for (Item item: items) {
			System.out.println("Article : "+cp);
			System.out.println(item.toString());
			cp++;
		}
	}

	public float getPrixTotaleSansTaxes() {

		for (Item item : items) {
			prixTotaleSansTaxes += item.getPrixTotal();
		}
		return prixTotaleSansTaxes;
	}

	
}