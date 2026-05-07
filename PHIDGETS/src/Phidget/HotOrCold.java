package Phidget;
import com.phidget22.*;

public class HotOrCold {




	    public static void main(String[] args) throws Exception {

	        TemperatureSensor tempSensor = new TemperatureSensor();

	        DigitalOutput greenLED = new DigitalOutput();
	        greenLED.setHubPort(0);
	        greenLED.setIsHubPortDevice(true);

	        DigitalOutput redLED = new DigitalOutput();
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        tempSensor.open(1000);
	        greenLED.open(1000);
	        redLED.open(1000);

	        while (true) {

	            double temp = tempSensor.getTemperature();

	            System.out.println("Temperature: " + String.format("%.2f", temp) + " °C");

	            if (temp >= 20 && temp <= 24) {
	                greenLED.setState(true);
	                redLED.setState(false);
	            } else {
	                greenLED.setState(false);
	                redLED.setState(true);
	            }

	            Thread.sleep(150);
	        }
	    }
	}

