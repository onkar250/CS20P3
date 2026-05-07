package Phidget;
import com.phidget22.*;

public class ThermoStat {



	    public static void main(String[] args) throws Exception {

	        TemperatureSensor tempSensor = new TemperatureSensor();

	        DigitalInput greenButton = new DigitalInput(); 
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);

	        DigitalInput redButton = new DigitalInput(); 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        DigitalOutput greenLED = new DigitalOutput();
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        DigitalOutput redLED = new DigitalOutput();
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        tempSensor.open(1000);
	        greenButton.open(1000);
	        redButton.open(1000);
	        greenLED.open(1000);
	        redLED.open(1000);

	        int setTemp = 21; 

	        boolean lastGreen = false;
	        boolean lastRed = false;

	        long lastPrintTime = System.currentTimeMillis();

	        while (true) {

	            double currentTemp = tempSensor.getTemperature();

	            boolean g = greenButton.getState();
	            boolean r = redButton.getState();

	            if (g && !lastGreen) {
	                setTemp++;
	                System.out.println("Set Temp increased to: " + setTemp);
	            }

	            if (r && !lastRed) {
	                setTemp--;
	                System.out.println("Set Temp decreased to: " + setTemp);
	            }

	            if (Math.abs(currentTemp - setTemp) <= 2) {
	                greenLED.setState(true);
	                redLED.setState(false);
	            } else {
	                greenLED.setState(false);
	                redLED.setState(true);
	            }

	            if (System.currentTimeMillis() - lastPrintTime >= 10000) {
	                System.out.println("Current Temp: " + String.format("%.2f", currentTemp) + " °C");
	                System.out.println("Set Temp: " + setTemp + " °C");
	                System.out.println("----------------------");
	                lastPrintTime = System.currentTimeMillis();
	            }

	            lastGreen = g;
	            lastRed = r;

	            Thread.sleep(50);
	        }
	    }
	}
