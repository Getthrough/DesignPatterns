package strategy.duck_example;

/**
 * 不会飞的鸭子
 *
 * @author getthrough
 * @date 2020/7/5
 */
public class CantFlyDuck extends Duck {

    public CantFlyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {

    }

}
