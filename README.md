# DesignPatterns
A repository about my exploration of design patterns

### Singleton Design Pattern

**NOTE**: all of these singleton types make no sense when using Reflection except **enum type**!

* Hungry Type
```$xslt
public class Singleton1 {
    private static Singleton1 obj = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return obj;
    }
}

```
* Lazy Type

    > Thread unsafe(most efficent)
    ```$xslt
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
    ```
    > Tread safe (Double-checked locking + volatile)
    ```$xslt
    public class Singleton4 implements Serializable {
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
         * implement this "readResolve" method to ensure the object returned by 
         * deserialized is the same as the object before serialized
         
         * see：https://docs.oracle.com/javase/7/docs/platform/serialization/spec/input.html#5903
         *
         * @return
         * @throws ObjectStreamException
         */
        protected Object readResolve() throws ObjectStreamException {
            return obj;
        }
    }
    ```
* Enum Type(Thread safe and serialization safe)
```$xslt
public enum Singleton5 {
 
    INSTANCE("getthrough", "HangZhou");
 
    private String name;
    private String address;
 
    Singleton5(){}
 
    Singleton5(String name, String address){
        this.name = name;
        this.address = address;

        // test construction execute
        System.out.println("surely executed!");
    }
 
    public static List<String> getProps() {

        for (Singleton5 singleton5 : Singleton5.values()) {
            return Arrays.asList(singleton5.getName(), singleton5.getAddress());
        }

        return null;

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}
 
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
```
* Static Inner Class Type
```$xslt
public class Singleton6 {
    private static class InnerClass {
        private static final Singleton6 obj = new Singleton6();
    }
 
    public static Singleton6 getInstance() {
        return InnerClass.obj;
    }
}
```
