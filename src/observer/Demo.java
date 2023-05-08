package observer;

public class Demo {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(statisticsDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
