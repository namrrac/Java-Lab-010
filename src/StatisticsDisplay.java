public class StatisticsDisplay implements Display {

    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        this.temperatureMin = Float.MIN_VALUE;
        this.temperatureMax = Float.MAX_VALUE;
        this.temperatureTotal = 0;
        this.numReadings = 0;
    }
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;
        numReadings++;
        if (temp < temperatureMin) {
            temperatureMin = temp;
        }
        if (temp > temperatureMax) {
            temperatureMax = temp;
        }
        display();
    }
    public void display() {
        float tempAvg = temperatureTotal / numReadings;
        System.out.println("Max: " + temperatureMax + "\nMin: " + temperatureMin + "\nAvg: " + tempAvg);
    }

}
