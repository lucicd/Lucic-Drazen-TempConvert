/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

import java.util.Scanner;

/**
 *
 * @author Drazen
 */
public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please, enter temperature in degrees Celsius:");
        temp = keyboard.nextDouble();
        
        temp = (9.0 / 5.0) * temp + 32.0;
        System.out.println("The temperature in degrees Fahrenheit is: " + temp);
    }
    
}
