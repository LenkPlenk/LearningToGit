
public class Main {

	public static void main(String[] args) {
		final double BURGER = 1.69;
		final double FRIES  = 1.09;
		final double POP_CANS = 0.99;
		double totalCost; 
		double tax;
		double totalCostTax;
		
		totalCost = (2 * BURGER) + (5 * FRIES) + (5 * POP_CANS); 
		System.out.println("The tvotal cost before tax is $" + Math.round(totalCost * 100)/ 100.0) ;
        tax = (totalCost * 1.13) - totalCost ; 
        System.out.println("The total tax is $" + Math.round(tax * 100 )/ 100.0);
        totalCostTax = tax + totalCost;
        System.out.println("The total cost is $" + Math.round(totalCostTax * 100)/ 100.0) ;
	}

}
