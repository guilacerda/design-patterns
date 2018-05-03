
public abstract class Game {
	public abstract void initialize();
	public abstract void startGame();
	public abstract void endGame();
	
	public void play() {
		this.initialize();
		this.startGame();
		this.endGame();
	}

}
