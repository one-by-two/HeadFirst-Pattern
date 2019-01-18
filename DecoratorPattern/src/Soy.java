
public class Soy extends CondimentDecorator {

	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if(beverage.getSize() == TALL) {
			cost += 0.10;
		}else if(beverage.getSize() == GRANDE) {
			cost += 0.15;
		}else {
			cost += 0.20;
		}
		
		return cost;
	}

}
