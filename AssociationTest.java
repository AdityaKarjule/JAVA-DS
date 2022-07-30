import java.time.LocalDate;

public class AssociationTest{
	public static void main(String[] args) {
		
		
		Customer cr= new Customer();
		cr.setCustomer("Aditya", 11, LocalDate.of(2022, 05, 04));
		
		
		Restaurant rt = new Restaurant();
		rt.setRestaurant("Menu", 2300, 11);
		
	SwappingMachine sp = new SwappingMachine();
	sp.setSwappingMachine("HDFC", 1234567, 2300);
	

		
	}
}


class Restaurant
{
	String items;
	int cost;
	int tableID;
	public void setRestaurant(String items, int cost, int tableID) {
	
		this.items = items;
		this.cost = cost;
		this.tableID = tableID;
		
		
	}
	@Override
	public String toString() {
		return "Restaurant [items=" + items + ", cost=" + cost + ", tableID=" + tableID + "]";
	}

}


class Customer{
	
	
	String name;
    int tableID; 
	LocalDate dateOfEntry;
	public void setCustomer(String name, int tableID, LocalDate dateOfEntry) {
		this.name = name;
		this.tableID = tableID;
		this.dateOfEntry = dateOfEntry;
		
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", tableID=" + tableID + ", dateOfEntry=" + dateOfEntry + "]";
	}
	

	}

class SwappingMachine extends Customer{
	String customerName;
	String bankName;
	int billNo;
	int amount;
	public void setSwappingMachine(String bankName, int accNo, int amount) {
		this.customerName = customerName;
		this.bankName = bankName;
		this.billNo = billNo;
		this.amount = amount;
	}
		void printSwappingMachine()
		{
			System.out.println("-----Reception Desk-----");
			System.out.println("Aditya:"+customerName);
			System.out.println("Your bill number is:  "+billNo);
			System.out.println("Charges for your selected food menu are : "+amount);
	}



class Receipt extends SwappingMachine
{
	String customerName;
	int tableNo;
	int amount;
	int transactionID;
	public void setReceipt(int tableNo, int amount, int transactionID) {
		this.tableNo = tableNo;
		this.amount = amount;
		this.transactionID = transactionID;
		this.customerName=customerName;;
		
		
	}
	void printReceipt() {
		System.out.println("-----Reception Desk-----");
		System.out.println("Aditya:"+customerName);
		System.out.println("Your bill number is:  "+billNo);
		System.out.println("Charges for your selected food menu are : "+amount);
}
	}
	
}


