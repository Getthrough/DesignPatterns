package observer.jdk_observer;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 通过实现{@link Observer}接口成为观察者
 *
 * @author getthrough
 * @date 2020/7/7
 */
public class JdkCurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public JdkCurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JdkWeatherData) {
            JdkWeatherData weatherData = JdkWeatherData.class.cast(o);
            setHumidity(weatherData.getHumidity());
            setTemperature(weatherData.getTemperature());
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: temperature is " + temperature + ", humidity is " + humidity);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
