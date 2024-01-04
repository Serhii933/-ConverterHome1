public class Converter {

    public static void main(String[] args) {
        Converter converter = new Converter();

        double miles = 10.0;
        double kilometers = converter.milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");

        double kilometersInput = 16.0934;
        double milesConverted = converter.kilometersToMiles(kilometersInput);
        System.out.println(kilometersInput + " кілометрів = " + milesConverted + " миль");
    }

    public double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}