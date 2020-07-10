package factory_method;

/**
 * 纽约风味披萨
 *
 * @author getthrough
 * @date 2020/7/10
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else {
            return new Pizza();
        }
    }

}
