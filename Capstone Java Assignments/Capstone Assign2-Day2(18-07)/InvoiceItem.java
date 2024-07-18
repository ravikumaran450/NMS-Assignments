class Invoice{

	private String ID;

	private String Desc;

	private int Quality;

	private double Unitprice;

	public String getID() {

		return ID;

	}

	public void setID(String ID) {

		this.ID = ID;

	}

	public String getDesc() {

		return Desc;

	}

	public void setDesc(String desc) {

		Desc = desc;

	}

	public int getQuality() {

		return Quality;

	}

	public void setQuality(int quality) {

		Quality = quality;

	}

	public double getUnitprice() {

		return Unitprice;

	}

	public void setUnitprice(double unitprice) {

		Unitprice = unitprice;

	}

	Invoice(String iD, String desc, int quality, double unitprice) {

		ID = iD;

		Desc = desc;

		Quality = quality;

		Unitprice = unitprice;

		

	}

	
	public void getTotal() {

		double total = Unitprice*Quality;

		System.out.println(" Total= " +total);

	}

	public String toString() {

		return "InvoiceItem [ID=" + ID + ", Desc=" + Desc + ", Quality=" + Quality + ", Unitprice=" + Unitprice + "]";

	}


}


public class InvoiceItem {

	 public static void main(String[] args) {

	        Invoice item1 = new Invoice("1", "Widget", 3, 19.99);

	        System.out.println(item1);

	        item1.getTotal();   

    }

}