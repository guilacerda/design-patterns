
public class FishburguerBuilder extends SandwichBuilder{
	private Sandwich sandwich = new Fishburguer();
	
	public void openBread() {
		System.out.println("Open the fishburguer bread.");
	}
	
	public void insertIngredients() {
		System.out.println("Inserts chease and fishburguer.");
	}
	
	public void closeBread() {
		System.out.println("Close the fishburguer bread.");
	}
	
	public Sandwich getSandwich() {
		System.out.println("Sandwich finalized");
		return sandwich;
	}
}
