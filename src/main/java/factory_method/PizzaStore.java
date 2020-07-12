package factory_method;

/**
 * 披萨店
 * <p>
 *     披萨店作为一个高层组件，现在依赖的是底层组件的抽象，而不是底层组件具体类；
 *     同样地，底层组件的实例化也依赖了高层组件的抽象（不同的披萨店）。工厂方法
 *     中体现了依赖倒置原则（Dependency Inversion Principle）。
 * </p>
 *
 * @author getthrough
 * @date 2020/7/10
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 创建披萨的工厂方法<br>
     *
     * 工厂方法特点：
     * <ul>
     *     <li>
     *         方法是抽象的，需要子类进行实现；
     *     </li>
     *     <li>
     *         必须返回一个产品（对象）；
     *     </li>
     *     <li>
     *         分离出具体创建对象的代码。
     *     </li>
     * </ul>
     *
     * @param type 披萨类型
     * @return 对应类型的披萨
     */
    protected abstract Pizza createPizza(String type);

}
