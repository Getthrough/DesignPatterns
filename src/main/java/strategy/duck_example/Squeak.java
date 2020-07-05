package strategy.duck_example;

/**
 * @author getthrough
 * @date 2020/7/5
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Zhi Zhi");
    }
}
