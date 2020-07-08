package decorator;

/**
 * 调料类。作为装饰者类，继承饮料超类。
 *
 * @author getthrough
 * @date 2020/7/8
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
