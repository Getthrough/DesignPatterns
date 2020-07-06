package observer;

/**
 * 观察者模式中"主题"接口
 *
 * @author getthrough
 * @date 2020/7/5
 */
public interface Subject {

    // 注册观察者
    void registerObserver(Observer observer);

    // 删除观察者
    void removeObserver(Observer observer);

    // 通知观察者
    void notifyObservers();

}
