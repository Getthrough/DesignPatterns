package factory_method;

/**
 * 芝加哥风味披萨店
 *
 * @author getthrough
 * @date 2020/7/10
 */
public class CCPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CCStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new CCStyleVeggiePizza();
        } else {
            return new Pizza();
        }
    }

}
