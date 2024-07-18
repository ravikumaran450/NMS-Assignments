import java.util.Scanner; 

class Bill { 
	public double findPrice(int itemId) { 
		switch (itemId) { 
			case 1001: return 25.0; 
			case 1002: return 20.0; 
			case 1003: return 23.0; 
			case 1004: return 18.0; 
			default: return 0.0; 
		} 
	} 
	public double findPrice(String brandName, String itemType, int size) { 
		if ("puma".equalsIgnoreCase(brandName) && "T-shirt".equalsIgnoreCase(itemType) 
			&& size == 34) { 
				return 25.0; 
		} else if ("puma".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) 
			&& size == 38) { 
				return 20.0; 
		} else if ("puma".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) 
			&& size == 40) { 
				return 20.0; 
		} else if ("Reebok".equalsIgnoreCase(brandName) && "T-shirt".equalsIgnoreCase(itemType) 
			&& size == 34) { 
				return 23.0; 
		} else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) 
			&& size == 36) { 
				return 18.0; 
		} else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 38) { return 18.0; } else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) 
			&& size == 40) { 
				return 18.0; 
		} else { 
			return 0.0; 
			} 
		} 
		}

public class Program3 { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		Bill bill = new Bill(); 
		System.out.println("Enter itemId:"); 
		int itemId = sc.nextInt(); 
		double priceById = bill.findPrice(itemId); 
		System.out.println("Price of the selected item is $" + priceById); 
		sc.nextLine(); 
		System.out.println("Enter brandName:"); 
		String brandName = sc.nextLine(); 
		System.out.println("Enter itemType:"); 
		String itemType = sc.nextLine(); 
		System.out.println("Enter size:"); 
		int size = sc.nextInt(); 
		double priceByDetails = bill.findPrice(brandName, itemType, size); 
		System.out.println("Price of the selected item is $" + priceByDetails); 
		sc.close(); 
} 
}