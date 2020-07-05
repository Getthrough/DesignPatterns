package strategy.duck_example;

import strategy.duck_example.CantFlyDuck;
import strategy.duck_example.Duck;

/**
 * 策略模式
 *
 * @author getthrough
 * @date 2020/7/5
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck cantFlyDuck = new CantFlyDuck();
        cantFlyDuck.performFly();
        cantFlyDuck.performQuack();
        System.out.println("动态切换实现后");
        // 动态改变方法实现
        cantFlyDuck.setFlyBehavior(new FlyWithWings());
        cantFlyDuck.setQuackBehavior(new Squeak());
        cantFlyDuck.performFly();
        cantFlyDuck.performQuack();
    }

}
