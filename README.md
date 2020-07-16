# DesignPatterns
A repository about my exploration of design patterns

### Singleton Pattern
> 单例模式: 确保一个类只有一个实例，并提供一个全局访问点。

**NOTE**: all of these singleton types make no sense when using Reflection except **enum type**!

### Strategy Pattern
> 策略模式(https://en.wikipedia.org/wiki/Strategy_pattern)是一种"行为"类型的软件设计模式，它允许程序在运行时动态选择算法，而非在代码中直接实现一种单一算法。将决定使用哪种算法的决定推迟到运行时，才能使调用代码更加灵活和可重用。
示例在`duck_example`目录下，参考《Head First Design Patterns》实现。

### Observer Pattern
> 观察者模式: 定义了对象之间的一对多依赖，当一个对象的状态改变时，它的所有依赖者都能够收到通知并更新。

### Decorator Pattern
> 装饰着模式: 动态地将责任附加到对象上。相比较继承，装饰者模式更易于扩展。

### Factory Method Pattern
> 工厂方法模式: 定义了一个创建对象的接口，但由子类决定要实例化哪个对象。工厂方法把实例化推迟到子类。

### Abstract Factory Pattern
> 抽象工厂模式: 提供了一种方式，可以将一组具有同一主题的单独的工厂封装起来。在正常使用中，客户端程序需要创建抽象工厂的具体实现，然后使用抽象工厂作为接口来创建这一主题的具体对象。


### 设计原则
* 封装变化
* 多用组合，少用继承
* 针对接口编程，不对实现编程
* 设计松耦合的交互对象
* 开放-关闭（对扩展开放，对修改关闭）
* 依赖抽象，不要依赖具体类








