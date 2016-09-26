package modele;

import java.util.List;

public interface IModeleData {
	
	public String getName();
	
	public void setName(String name);
	
	public List<Item> getItems();
	
	public void setItem(List<Item> item);
	
	public void addItem (Item item);
	
	public void removeItem (Item item);
	
	public float getTotalValeurItem();

	public void setTotalValeurItem(float totalValeurItem);

}
