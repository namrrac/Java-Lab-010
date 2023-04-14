public class CurrentConditions implements Display {
    private final WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;

    }
    public void update() {
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }
    public void display() {
        System.out.println(temperature + "\n" + humidity + "\n" pressure);
    }
}
