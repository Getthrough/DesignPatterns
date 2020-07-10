package factory_method;

/**
 * 纽约素菜披萨
 *
 * @author getthrough
 * @date 2020/7/10
 */
public class NYStyleVeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("NY Style Veggie prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY Style Veggie bake");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Veggie cut");
    }

    @Override
    public void box() {
        System.out.println("NY Style Veggie box");
    }
}
