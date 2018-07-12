package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式测试类
 *
 * @author getthrough
 * @date 2018/7/13
 */
public class SingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        testSinglton1();
//        testSinglton2();
//        testSinglton4();
//        testSinglton5();
//        testSinglton5_2();// can't work due to NoSuchMethodException
        testSinglton6();

    }

    private static void testSinglton6() {

        Singleton6 obj1 = Singleton6.getInstance();
        Singleton6 obj2 = Singleton6.getInstance();

        System.out.printf("Singleton1 test: obj1 == obj2 ? -> %s\n", obj1 == obj2);

    }

    private static void testSinglton5_2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Singleton5 obj1 = Singleton5.INSTANCE;
        Constructor declaredConstructor = obj1.getClass().getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        Singleton5 obj2 = (Singleton5) declaredConstructor.newInstance();

//        Class<? extends Singleton5> aClass = obj1.getDeclaringClass();
//        Singleton5 obj2 = aClass.newInstance();


        System.out.printf("Singleton5 test with reflection: obj1 == obj2 ? -> %s\n", obj1 == obj2);
    }

    private static void testSinglton5() throws IOException, ClassNotFoundException {

        Singleton5 obj1 = Singleton5.INSTANCE;
        FileOutputStream fos = new FileOutputStream("out.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream("out.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton5 obj2 = (Singleton5) ois.readObject();

        System.out.printf("Singleton5 test with deserialization: obj1 == obj2 ? -> %s\n", obj1 == obj2);
    }

    private static void testSinglton4() throws IOException, ClassNotFoundException {

        Singleton4 obj1 = Singleton4.getInstance();
        FileOutputStream fos = new FileOutputStream("out.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream("out.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton4 obj2 = (Singleton4) ois.readObject();

        System.out.printf("Singleton4 test with deserialization: obj1 == obj2 ? -> %s\n", obj1 == obj2);
    }

    private static void testSinglton1() {

        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();

        System.out.printf("Singleton1 test: obj1 == obj2 ? -> %s\n", obj1 == obj2);

    }

    private static void testSinglton2() {

        Singleton2 obj1 = Singleton2.getInstance();
        Singleton2 obj2 = Singleton2.getInstance();

        System.out.printf("Singleton2 test: obj1 == obj2 ? -> %s\n", obj1 == obj2);

    }

}
