package singleton;

/**
 *
 *
 * @author getthrough
 * @date 2018/7/13
 */
public class Singleton6 {
    private static class InnerClass {
        private static final Singleton6 obj = new Singleton6();

    }

    public static Singleton6 getInstance() {
        return InnerClass.obj;
    }
}
