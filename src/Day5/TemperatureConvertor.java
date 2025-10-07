package Day5;

public class TemperatureConvertor {
    public static double celsiusToFahrenheit(double C) {
        double F;
        F = (C * 9 / 5) + 32;
    return F;
}
    public static void main (String[] args){
       System.out.println(celsiusToFahrenheit(67));
    }
}
