package strategy.duck_example;

/**
 * @author getthrough
 * @date 2020/7/5
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can fly");
    }

}
