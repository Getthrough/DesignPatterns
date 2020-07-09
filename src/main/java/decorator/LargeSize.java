package decorator;

/**
 * 大杯
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class LargeSize extends SizeDecorator {

    Beverage beverage;

    public LargeSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", LargeSize";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
