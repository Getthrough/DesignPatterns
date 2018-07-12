package singleton;

/**
 * 饿汉式单例：预先创建一个静态的私有对象，通过静态getInstance方法获取该类的单例对象
 *
 * @author getthrough
 * @date 2018/7/13
 */
public class Singleton1 {
    private static Singleton1 obj = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return obj;
    }
}
