package main;
import java.util.HashMap;
import java.util.Map;

public class Commande {

	private Map<String,Double> tva=new HashMap<>();

	public Map<String, Double> getTva() {
		return tva;
	}

	public void setTva(Map<String, Double> tva) {
		this.tva = tva;
	}

	public void inittaux()
	{
		tva.put("Fr", 0.2);
		tva.put("Gn", 0.1);
		tva.put("Ma", 0.3);
	}

}