package strategy.duck_example;

/**
 * @author getthrough
 * @date 2020/7/5
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.err.println("can't fly");
    }
}
