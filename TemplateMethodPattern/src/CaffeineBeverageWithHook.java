
public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
		
	}
	
    boolean customerWantsCondiments() {
		return true;
	}

	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling Water");
	}
	
	public void pourInCup() {
		System.out.println("Pour into cup");
	}
}
