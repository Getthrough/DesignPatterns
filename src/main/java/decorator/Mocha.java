package decorator;

import com.sun.jndi.ldap.Ber;

/**
 * 摩卡咖啡。饮料的一种
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
