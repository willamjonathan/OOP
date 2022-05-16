import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private ArrayList<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        this.customers = new ArrayList<Customer>();
        this.bankName = bName;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        this.customers.add(customer);
        numberOfCustomers ++;   
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }
    
    
}
