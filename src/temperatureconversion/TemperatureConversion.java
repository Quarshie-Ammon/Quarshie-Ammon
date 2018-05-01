/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;
import java.util.Scanner;

/**
 *
 * @author Saturn
 */
public class TemperatureConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int degCelsius, degFahrenheit;
        double numerator = 9.0 , denominator = 5.0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("input your temperature in degrees Celsius: ");
        degCelsius = keyboard.nextInt();
        
        degFahrenheit = (int) ((numerator / denominator) * degCelsius + 32);
        
        System.out.println("The temperature in Fahrenheit is " + degFahrenheit);
    }
    
}
