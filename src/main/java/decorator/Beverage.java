package decorator;

/**
 * 饮料类型的超类
 *
 * @author getthrough
 * @date 2020/7/8
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 价格计算方法
     *
     * @return 价格
     */
    public abstract double cost();
}
