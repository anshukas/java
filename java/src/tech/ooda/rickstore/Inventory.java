package tech.ooda.rickstore;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	@SuppressWarnings("rawtypes")
	private List guitars;

	@SuppressWarnings("rawtypes")
	public Inventory() {
		guitars = new LinkedList();
	}

	@SuppressWarnings("unchecked")
	public void add(String serialNumber, double price, String builder,
			String model, String type, String backWood, String topWood) {
		
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type,
				backWood, topWood);
		
		guitars.add(guitar);
		
	}

}
