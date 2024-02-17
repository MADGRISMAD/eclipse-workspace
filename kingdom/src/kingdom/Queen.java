package kingdom;

public class Queen extends Character{
	public Queen() {
		weapon = new BowAndArrowBehavior();
	}

	public void display() {
		System.out.println("I'm a Queen");
	}

}
