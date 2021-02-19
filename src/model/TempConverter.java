/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Feb 18, 2021
 */
package model;

public class TempConverter {

	private int temp;		// Holds value for user input for temp in degrees
	private int degreesF;	// Holds value for degrees F
	private int degreesC;	// Holds value for degrees C
	private int tempType;	// Determines the formula used based on F(1) or C(2)
	
	/**
	 * Default no-arg constructor
	 */
	public TempConverter() {
		super();
	}

	/**
	 * Non-default constructor
	 * @param temp
	 * @param tempType
	 */
	public TempConverter(int temp, int tempType) {
		super();
		this.temp = temp;
		this.tempType = tempType;
		setTemperature(temp, tempType);
	}

	/**
	 * Getters and Setters
	 */
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		setTemperature(temp, tempType);
	}

	public int getDegreesF() {
		return degreesF;
	}

	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}
	
	public int getTempType() {
		return tempType;
	}

	public void setTempType(int tempType) {
		this.tempType = tempType;
	}
	/**
	 * End of Getters and Setters
	 */
	
	
	/**
	 * This method calculates the convertion for Celsius to Farenheit
	 * as well as Farenheit to Celsius based on the value for tempType
	 * @param temp : User input for degrees
	 * @param tempType : 1 for F, 2 for C
	 */
	public void setTemperature(int temp, int tempType) {
		if(tempType == 1) {
			// Converts to Celsius
			degreesC = (temp - 32) * 5 / 9;
		}
		else if(tempType == 2) {
			// Converts to Farenheit
			degreesF = (temp * 9/5) + 32;
		}
	}
	
	// Creates a String message for the output of the convertion based on tempType
	@Override
	public String toString() {
		String message = "";
		
		if(tempType == 1) {
			message = "Temp Converter [" + temp + " degrees Fahrenheit is " + degreesC + " degrees Celsius]";
		}
		else if(tempType == 2) {
			message = "Temp Converter [" + temp + " degrees Celsius is " + degreesF + " degrees Fahrenheit]";
		}
		
		return message;
	}
}
