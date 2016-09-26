package modele;
import java.util.ArrayList;
import java.util.List;


public class ModeleData implements IModeleData{
	
	private String name;
	public List<Item> items = new ArrayList<Item>();
	private float totalValeurItem;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ModeleData(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public List<Item> getItems() {
		return items;
	}
	@Override
	public void setItem(List<Item> item) {
		this.items = items;
		
	}
	@Override
	public void addItem(Item item) {
		items.add(item);
		
	}
	@Override
	public void removeItem(Item item) {
		items.remove(item);
		
	}
	
	public float getTotalValeurItem() {
		return calculTotalValeurItem() ;
	}
	
	public float calculTotalValeurItem(){
		float n =0;
		for (Item i : items){
			n += i.getMontant();
		}
		return n;
	}

	public void setTotalValeurItem(float totalValeurItem) {
		this.totalValeurItem = totalValeurItem;
	}

	public ModeleData (){
		super();
	}
	
}
