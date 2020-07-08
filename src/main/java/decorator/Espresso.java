package decorator;

/**
 * 浓缩咖啡。饮料的一种。
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
