package kingdom;

public class Troll extends Character{
	public Troll() {
		weapon = new KnifeBehavior();
	}

	public void display() {
		System.out.println("I'm a Troll");
	}

}
