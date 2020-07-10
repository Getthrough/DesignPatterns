package factory_method;

/**
 * @author getthrough
 * @date 2020/7/10
 */
public class NYStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("NY Style Cheese prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY Style Cheese bake");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cheese cut");
    }

    @Override
    public void box() {
        System.out.println("NY Style Cheese box");
    }
}
