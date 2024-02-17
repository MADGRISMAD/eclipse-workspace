package patos;

public class MallardDuck extends Duck {
public MallardDuck() {
flyBehavior = new FlyNoWay();
quackBehavior = new Quack();
}
public void display() {
System.out.println("I'm a model duck");
}
}
