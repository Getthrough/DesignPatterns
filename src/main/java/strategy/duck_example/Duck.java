package strategy.duck_example;

/**
 * 鸭子超类
 *
 * @author getthrough
 * @date 2020/7/5
 */
public abstract class Duck {

    // 飞行行为属性
    protected FlyBehavior flyBehavior;

    // 呱呱叫行为属性
    protected QuackBehavior quackBehavior;

    // 游泳
    protected void swim() {

    }

    // 展示外表
    protected abstract void display();

    /**
     * 由于不是所有鸭子都会叫，因此不能作为公共方法进行实现。
     */
//    protected void quack() {
//
//    }

    /**
     * 由于不是所有鸭子都会飞，因此不能作为公共方法进行实现。
     */
//    protected void fly() {
//        System.out.println(this.getClass().getName() + " is flying");
//    }

    /**
     * 委托叫方法
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 委托飞方法
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
