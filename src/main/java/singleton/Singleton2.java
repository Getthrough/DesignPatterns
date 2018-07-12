package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 线程不安全的懒汉单例：先判断该对象是否存在，1：存在，直接返回；2：不存在，创建一个对象返回。
 *
 * @author getthrough
 * @date 2018/7/13
 */
public class Singleton2 {
    private static Singleton2 obj;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (null == obj) {
            obj = new Singleton2();
        }
        return obj;
    }
}

/**
 * 使用同步方法进行线程安全控制的懒汉单例
 */
class Singleton3 {
    private static Singleton3 obj;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (null == obj) {
            obj = new Singleton3();
        }
        return obj;
    }
}

/**
 * 双检锁 + volatile
 *
 */
class Singleton4 implements Serializable {
    private static volatile Singleton4 obj;

    private Singleton4(){
    }

    public static Singleton4 getInstance() {
        if (null == obj) {
            synchronized (Singleton4.class) {
                if (null == obj){
                    obj = new Singleton4();
                    return obj;
                }
            }
        }

        return obj;
    }

    /**
     * 如果不实现该方法，那么该对象序列化与反序列化前后所得到的对象不是同一个
     * 详见：https://docs.oracle.com/javase/7/docs/platform/serialization/spec/input.html#5903
     *
     * @return
     * @throws ObjectStreamException
     */
    protected Object readResolve() throws ObjectStreamException {
        return obj;
    }
}