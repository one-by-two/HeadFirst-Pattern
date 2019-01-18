
public abstract class Beverage {
	String description = "Unknown Beverage";
	public final int  TALL = 0;
	public final int  GRANDE = 1;
	public final int  VENTI = 2;
	int size;
	public int getSize() {
		return size;
	}
    public void setSize(int size) {
    	this.size = size;
    }
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
