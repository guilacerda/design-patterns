
public class Main {

	public static void main(String[] args) {
		Kitchen kitchen = new Kitchen();

		SandwichBuilder b1 = new HamburguerBuilder();
		SandwichBuilder b2 = new FishburguerBuilder();
		
		kitchen.doSandwich(b1);
		b1.getSandwich();
		
		kitchen.doSandwich(b2);
		b2.getSandwich();
	}

}
