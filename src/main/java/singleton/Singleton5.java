package singleton;

import java.util.Arrays;
import java.util.List;

/**
 * Note: event the enum classs still unable to  avoid the risk that causing trouble by using Reflection
 *
 * @author getthrough
 * @date 2018/7/13
 */
public enum Singleton5 {
    INSTANCE("getthrough", "HangZhou");

    private String name;
    private String address;

    Singleton5(){}

    Singleton5(String name, String address){
        this.name = name;
        this.address = address;

//        // test construction execute
//        System.out.println("surely executed!");
    }

    public static List<String> getProps() {

        for (Singleton5 singleton5 : Singleton5.values()) {
            return Arrays.asList(singleton5.getName(), singleton5.getAddress());
        }

        return null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * console output:
     *      surely executed!
     *      INSTANCE
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Singleton5.INSTANCE);
    }
}
