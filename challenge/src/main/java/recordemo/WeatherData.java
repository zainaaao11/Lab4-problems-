package recordemo;
public record WeatherData(double temperatureCelsius, String conditions){

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit(){
        return temperatureCelsius*9/5+32;
    }

    // Instance method to get a formatted summary string
    public String getSummary(){
        double tempFahr=temperatureFahrenheit();
        return String.format("Current weather: %.1f°C (%.1f°F) and %s %n", temperatureCelsius, tempFahr, conditions);
    }

    //Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions){
        double tempCelsius=(5*(tempFahrenheit-32))/9;
        return new WeatherData(tempCelsius, conditions);
    }

    //try the methods
    public static void main(String[] args){
        WeatherData todaysWeather= new WeatherData(25.0, "Sunny");
        WeatherData yesterdaysWeather= WeatherData.fromFahrenheit(50.0, "Cloudy");
        System.out.print("Today's weather: "+todaysWeather.getSummary());
        System.out.print("Yesterday's weather: "+yesterdaysWeather.getSummary());
    }
}
