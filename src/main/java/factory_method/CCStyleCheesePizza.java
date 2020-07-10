package factory_method;

/**
 * @author getthrough
 * @date 2020/7/10
 */
public class CCStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("CC Style Cheese prepare");
    }

    @Override
    public void bake() {
        System.out.println("CC Style Cheese bake");
    }

    @Override
    public void cut() {
        System.out.println("CC Style Cheese cut");
    }

    @Override
    public void box() {
        System.out.println("CC Style Cheese box");
    }

}
