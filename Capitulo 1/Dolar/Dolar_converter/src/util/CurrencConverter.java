package util;



public class CurrencConverter {

    public static double IOF = 0.06;
    
public static double Converter( double Many, double Dollar) {
    return (Dollar * Many) + (Dollar * Many *IOF);
}

}
