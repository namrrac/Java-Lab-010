public class ForcastDisplay implements Display {
    private WeatherStation ws;
    float currentPressure;
    float lastPressure;

    private ForcastDisplay(WeatherStation ws) {
        this.ws = ws;
        this.currentPressure = ws.getPressure();
        this.lastPressure = 0.0f;

    }
    public void update() {
        lastPressure = currentPressure;
        currentPressure = ws.getPressure();
        display();
    }
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
