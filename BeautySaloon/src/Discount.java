public class Discount{
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String s) {
		switch(s) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return	serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
            throw new IllegalArgumentException("wrong service type specified"); // Trying Something New :)
		}
	}
	public static double getProductDiscountRate(String t) {
		switch(t) {
		case "Premium":
			return productDiscountPremium;
		case "Gold":
			return	productDiscountGold;
		case "Silver":
			return productDiscountSilver;
		default:
            throw new IllegalArgumentException("wrong service type specified"); // Trying Something New :)
		}
	}
}
