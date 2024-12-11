import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void cleanData(double lower, double upper) {
        int i = 0;
        
        while (i < temperatures.size()) {
            if (temperatures.get(i) > upper || temperatures.get(i) < lower) {
                temperatures.remove(i);
            } else {
                i++;
            }
        }
    }

    public int longestHeatWave(double threshold) {
        int longestHeatWaveLen = 0, currHeatWaveLen = 0;

        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > threshold) {
                currHeatWaveLen++;
            } else {
                if (currHeatWaveLen > longestHeatWaveLen) longestHeatWaveLen = currHeatWaveLen;
                currHeatWaveLen = 0;
            }
        }

        return longestHeatWaveLen;
    }

    public String toString() {
        return temperatures.toString();
    }
}