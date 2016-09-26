package view;

import java.awt.geom.Arc2D;

import modele.Item;

public class FabricationQuartier extends Arc2D.Float{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Item item;
	private Float start;
	private Float extent;
	private boolean expanded;
	

	public FabricationQuartier(float start, float extent, Item item) {
		super(75, 75, 400, 400, start, extent, Arc2D.PIE);
		this.item = item;
		this.expanded = false;
	}
	
	public FabricationQuartier() {
		
	}



	public Float getStart() {
		return start;
	}

	public void setStart(Float start) {
		this.start = start;
	}

	public Float getExtent() {
		return extent;
	}

	public void setExtent(Float extent) {
		this.extent = extent;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	

    public void retract() {
        this.setArc(new Arc2D.Double(75, 75, 400, 400,this.getAngleStart(),this.getAngleExtent(),Arc2D.PIE));
        expanded = false;
    }

    public void expand() {
        this.setArc(new Arc2D.Double(75, 75, 800, 800,this.getAngleStart(),this.getAngleExtent(),Arc2D.PIE));
        expanded = true;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
}

	

}
