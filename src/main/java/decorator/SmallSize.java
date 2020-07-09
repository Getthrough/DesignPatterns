package decorator;

/**
 * 小杯
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class SmallSize extends SizeDecorator {

    Beverage beverage;

    public SmallSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SmallSize";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
