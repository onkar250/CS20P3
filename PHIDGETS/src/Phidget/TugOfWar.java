package Phidget;
import com.phidget22.*;

public class TugOfWar {





		    public static void main(String[] args) throws Exception {

		        DigitalInput redButton = new DigitalInput();
		        redButton.setHubPort(0);
		        redButton.setIsHubPortDevice(true);

		        DigitalInput greenButton = new DigitalInput();
		        greenButton.setHubPort(5);
		        greenButton.setIsHubPortDevice(true);

		        DigitalOutput redLED = new DigitalOutput();
		        redLED.setHubPort(1);
		        redLED.setIsHubPortDevice(true);

		        DigitalOutput greenLED = new DigitalOutput();
		        greenLED.setHubPort(4);
		        greenLED.setIsHubPortDevice(true);

		        redButton.open(1000);
		        greenButton.open(1000);
		        redLED.open(1000);
		        greenLED.open(1000);

		        int red = 0;
		        int green = 0;

		        boolean lastRed = false;
		        boolean lastGreen = false;

		        while (true) {

		            boolean r = redButton.getState();
		            boolean g = greenButton.getState();

		            if (r && !lastRed) red++;
		            if (g && !lastGreen) green++;

		            System.out.println("Red: " + red + " Green: " + green);

		            if (red >= 10 || green >= 10) {

		                redLED.setState(true);
		                greenLED.setState(true);
		                Thread.sleep(300);
		                redLED.setState(false);
		                greenLED.setState(false);
		                Thread.sleep(300);

		                DigitalOutput winner = (red >= 10) ? redLED : greenLED;

		                for (int i = 0; i < 5; i++) {
		                    winner.setState(true);
		                    Thread.sleep(300);
		                    winner.setState(false);
		                    Thread.sleep(300);
		                }

		                break; 
		            }

		            lastRed = r;
		            lastGreen = g;

		            Thread.sleep(100);
		        }
		    }

	}

