package kingdom;

public class King extends Character {
	public King() {
		weapon = new SwordBehavior();
	}

	public void display() {
		System.out.println("I'm a King");
	}

}
