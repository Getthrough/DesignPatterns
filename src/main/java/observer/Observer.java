package observer;

/**
 * 观察者模式中"观察者"接口
 *
 * @author getthrough
 * @date 2020/7/5
 */
public interface Observer {

    /**
     * 接收通知后的更新方法
     *
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);

}
