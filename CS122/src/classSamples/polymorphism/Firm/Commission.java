package classSamples.polymorphism.Firm;

public class Commission extends Hourly {
	
	double totalSales, commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = cRate;
		
	}
	public void addSales(double totalSales) {
		totalSales += totalSales;
	}
	
	public double pay() {
		double paid = super.pay() + (totalSales * commissionRate);
		return paid;
	}
	
	public String toString() {
		String result = super.toString();
		result+= "\nTotal Sales Made: " + totalSales;
		return result;
	}

}
