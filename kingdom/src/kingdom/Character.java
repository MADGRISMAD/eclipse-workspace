package kingdom;

public abstract class Character {
	weaponBehavior weapon;
	public Character() { }
	public abstract void display();

	public void fight() {
		weapon.useWeapon();
	}	

	public void setWeapon(weaponBehavior w) {
		weapon = w;
		
	}
	

}
