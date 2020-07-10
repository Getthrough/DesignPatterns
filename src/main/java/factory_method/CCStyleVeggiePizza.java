package factory_method;

/**
 * @author getthrough
 * @date 2020/7/10
 */
public class CCStyleVeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("CC Style Veggie prepare");
    }

    @Override
    public void bake() {
        System.out.println("CC Style Veggie bake");
    }

    @Override
    public void cut() {
        System.out.println("CC Style Veggie cut");
    }

    @Override
    public void box() {
        System.out.println("CC Style Veggie box");
    }

}
