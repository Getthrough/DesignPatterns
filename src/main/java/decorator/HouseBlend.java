package decorator;

/**
 * xx咖啡。饮料的一种。
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
