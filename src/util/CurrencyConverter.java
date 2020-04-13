package util;

public class CurrencyConverter {
	
	public static double dolar;
	public static double dolarPrice;
	public static final double TAX = 0.06;
	
	public static double totalInReais(){
		return dolar * dolarPrice + dolar * dolarPrice * TAX;
	}

}
