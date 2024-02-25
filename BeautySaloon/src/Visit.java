import java.util.Date;
public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense,productExpense;
	Visit(Customer c,Date date){
		customer = c;
		this.date = date;
	}
	String getName() {
		return customer.getName();
	}
	double getServiceExpense() {
		return serviceExpense;
	}
	void setServiceExpense(double s) {
		this.serviceExpense += s;
	}
	double getProductExpense() {
		return productExpense;
	}
	void setProductExpense(double p) {
		productExpense += p;
	}
	double getTotalExpense() {
		if (customer.isMember())
		return (serviceExpense - (serviceExpense * Discount.getServiceDiscountRate(customer.getMemberType()))+
					(productExpense - (productExpense * Discount.getProductDiscountRate(customer.getMemberType()))));
		else return serviceExpense + productExpense;
	}
	public String toString() {
		return "Visit:" +"\n"+
                "customer name=" + customer.getName() +"\n"+
                ", customer member=" + customer.isMember() +"\n"+
                ", customer member type=" + customer.getMemberType() +"\n"+
                ", date=" + date +"\n"+
                ", serviceExpense=" + getServiceExpense() +"\n"+
                ", productExpense=" + getProductExpense() +"\n"+
                "Total Expenses="+getTotalExpense();
	}
	
}
