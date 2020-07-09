package decorator;

/**
 * 星巴兹咖啡测试
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class StarbuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        // 通过传入原始的咖啡应用，一层一层地添加调料，达到装饰增强的目的
        Beverage houseBlend = new HouseBlend();
        houseBlend = new SmallSize(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());
    }

}
