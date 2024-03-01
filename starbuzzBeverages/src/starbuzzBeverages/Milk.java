package starbuzzBeverages;


public class Milk extends CondimentDecorator {
	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
