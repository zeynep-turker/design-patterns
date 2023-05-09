package observer;

public class WeatherScreen implements Observer {

	@Override
	public void update(int temperature) {
		System.out.println("Weather updated: " + temperature);
	}
}



