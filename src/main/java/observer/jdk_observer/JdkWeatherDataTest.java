package observer.jdk_observer;

/**
 * @author getthrough
 * @date 2020/7/5
 */
public class JdkWeatherDataTest {

    public static void main(String[] args) {
//        Subject subject = new WeatherData();
//        Observer currentConditions = new CurrentConditionsDisplay(subject);

        JdkWeatherData weatherData = new JdkWeatherData();
        java.util.Observer currentConditions = new JdkCurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(27f, 40f, 0.02f);
        weatherData.setMeasurements(27.5f, 41f, 0.025f);
        weatherData.setMeasurements(27.7f, 41.2f, 0.19f);
    }

}
