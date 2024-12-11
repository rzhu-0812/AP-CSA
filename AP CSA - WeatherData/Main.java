import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> weatherData1 = new ArrayList<>();
        weatherData1.add(99.1);
        weatherData1.add(142.0);
        weatherData1.add(85.0);
        weatherData1.add(85.1);
        weatherData1.add(84.6);
        weatherData1.add(94.3);
        weatherData1.add(124.9);
        weatherData1.add(98.0);
        weatherData1.add(101.0);
        weatherData1.add(102.5);

        ArrayList<Double> weatherData2 = new ArrayList<>();
        weatherData2.add(100.5);
        weatherData2.add(98.5);
        weatherData2.add(102.0);
        weatherData2.add(103.9);
        weatherData2.add(87.5);
        weatherData2.add(105.2);
        weatherData2.add(90.3);
        weatherData2.add(94.8);
        weatherData2.add(109.1);
        weatherData2.add(102.1);
        weatherData2.add(107.4);
        weatherData2.add(93.2);

        WeatherData wd1 = new WeatherData(weatherData1);
        wd1.cleanData(85.0, 120.0);
        System.out.println(wd1);

        WeatherData wd2 = new WeatherData(weatherData2);
        System.out.println(wd2.longestHeatWave(100.5));
        System.out.println(wd2.longestHeatWave(95.2));
    }
}
