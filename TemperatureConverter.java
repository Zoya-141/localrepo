import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit

