class Customer {

    private int customerId;

    private String customerName;

    private int Discount;



     Customer(int customerId, String customerName, int Discount) {

        this.customerId = customerId;

        this.customerName = customerName;

        this.Discount = Discount;

    }



    public int getCustomerId() {

        return customerId;

    }

    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }



    public String getCustomerName() {

        return customerName;

    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }



    public int getDiscount() {

        return Discount;

    }

    public void setDiscount(int Discount) {

        this.Discount = Discount;

    }



    @Override

    public String toString() {

        return "Customer{" +

                "customerId= " + customerId  +

                ", customerName= " + customerName +

                ", Discount=" + Discount + "%"+

                '}';

    }

}





class invoice{

    private int invoiceId;

    private double Amount;

    private Customer customer; 



 invoice(int invoiceId, double Amount, Customer customer) {

        this.invoiceId = invoiceId;

        this.Amount = Amount;

        this.customer = customer;

    }



    public int getInvoiceId() {

        return invoiceId;

    }

    public void setInvoiceId(int invoiceId) {

        this.invoiceId = invoiceId;

    }



    public double getAmount() {

        return Amount;

    }

    public void setAmount(double Amount) {

        this.Amount = Amount;

    }



    public Customer getCustomer() {

        return customer;

    }

    public void setCustomer(Customer customer) {

        this.customer = customer;

    }

    

    public int getCustomerID() {

    	return customer.getCustomerId();

    }

    

    public String getCustomerName() {

    	return customer.getCustomerName();

    }

    

    public void getAmountAfterDiscount(){

    	double amount = (customer.getDiscount()/Amount)*100;

    	System.out.println("Amount After Discount= " +amount);

    }

    

    @Override

    public String toString() {

        return "Invoice{" +

                "invoiceId=" + invoiceId  +

                ", totalAmount=" + Amount +

                ", customer=" + customer +

                '}';

    }

}


public class CustomerClass {

	 public static void main(String[] args) {

		 

	        Customer customer = new Customer(1, "Siva", 50);

	        System.out.println(customer.getDiscount());

	        System.out.println(customer);

	        

	        invoice invoice = new invoice(2, 1500, customer);

	        invoice.getAmountAfterDiscount();

	        System.out.println(invoice);

	    }

}