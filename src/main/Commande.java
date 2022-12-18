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

	public Map<String, Double> getTva() {
		return tva;
	}

	public void setTva(Map<String, Double> tva) {
		this.tva = tva;
	}

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
		float prix = 0f;
		for (Item item : items) {
			prix += item.getPrixTotal();
		}
		prixTotaleSansTaxes = prix;
		return prix;
	}
	public void inittaux()
	{
		tva.put("Fr", 0.2);
		tva.put("Gn", 0.1);
		tva.put("Ma", 0.3);
	}
	public float getTTCPrice() {
		for(Item item: items) {
			TCCPrice += item.getPrixTotal() *(1 - tva.get(item.getDesignation()));
		}
		return TCCPrice;
	}
	public Double getTaxCodeByCountryCode(String codeEtat) {
		return tva.get(codeEtat);
	}
	public List<Integer> getReductionList()
	{
		List<Integer> reductionList = new ArrayList<>();
		reductionList.add(3);
		reductionList.add(5);
		reductionList.add(7);
		reductionList.add(10);
		reductionList.add(15);
		return reductionList;
	}
	public double getPriceAfterReduction(double reduction) {
		return getPrixTotaleSansTaxes() * (1-reduction);
	}
	public double getReductionByTotalPrice()
	{
		float res=getPrixTotaleSansTaxes();
		if(res>1000 && res <= 5000)
			return 0.03;
		else if(res>5000 && res <= 7000)
			return 0.05;
		else if(res>7000 && res <= 10000)
			return 0.07;
		else if(res>10000 && res <= 50000)
			return 0.10;
		else if(res>50000)
			return 0.15;
		else
			return 1.0;

	}
}