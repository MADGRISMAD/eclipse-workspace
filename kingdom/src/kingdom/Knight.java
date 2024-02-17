package kingdom;

public class Knight extends Character{
	public Knight() {
		weapon = new AxeBehavior();
	}

	public void display() {
		System.out.println("I'm a Knight");
	}

}
