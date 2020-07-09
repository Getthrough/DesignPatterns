package decorator;

/**
 * 中杯
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class MediumSize extends SizeDecorator {

    Beverage beverage;

    public MediumSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MediumSize";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
