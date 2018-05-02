
public class HamburguerBuilder extends SandwichBuilder{
	private Sandwich sandwich = new Hamburguer();
	
	public void openBread() {
		System.out.println("Open the Hamburguer bread.");
	}
	
	public void insertIngredients() {
		System.out.println("Inserts chease and hamburguer.");
	}
	
	public void closeBread() {
		System.out.println("Close the Hamburguer bread.");
	}
	
	public Sandwich getSandwich() {
		System.out.println("Sandwich finalized\n");
		return sandwich;
	}
}
