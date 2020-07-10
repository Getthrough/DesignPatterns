package factory_method;

/**
 * @author getthrough
 * @date 2020/7/10
 */
public class PizzaStoreTest {

    public static void main(String[] args) {
        // 找一家纽约风味披萨店
        PizzaStore ps = new NYPizzaStore();
        Pizza pizza = ps.orderPizza("veggie");
        System.out.println("=============================");
        // 找一家芝加哥风味披萨店
        PizzaStore ps2 = new CCPizzaStore();
        Pizza pizza2 = ps2.orderPizza("veggie");
    }

}
