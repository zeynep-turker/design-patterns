package observer;

public class Demo {
	public static void main(String[] args) {
		Weather weather = new Weather();

		WeatherScreen screen = new WeatherScreen();

		weather.addObserver(screen);

		weather.setTemperature(25);
		weather.setTemperature(30);

		weather.removeObserver(screen);

		weather.setTemperature(35);
	}
}



