public class StatisticsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float pressure;
	private float humidity;

	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("The specific statistics is: "
			+ "temperature = " + temperature
			+ ", humidity = " + humidity
			+ ", pressure = " + pressure);	
	}
}
