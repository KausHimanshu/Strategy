//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new Quack());
        duck1.display();
        duck1.swim();
        duck1.performFly();
        duck1.performQuack();

        Duck duck2 = new RubberDuck();
        duck2.setFlyBehavior(new FlyNoWay());
        duck2.setQuackBehavior(new Squeak());
        duck2.display();
        duck2.swim();
        duck2.performFly();
        duck2.performQuack();
    }
}