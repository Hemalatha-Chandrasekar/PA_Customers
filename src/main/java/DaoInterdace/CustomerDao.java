package DaoInterdace;

import model.customer;
import model.item;

import java.util.List;

public interface CustomerDao {


    // Method to retrieve all customers
    List<customer> getAllCustomers();

    // Method to save a list of customers
    void saveCustomer(List<customer> customerList);

    // Method to delete a customer by ID
    boolean deleteCustomer(int id);

    // Method to update customer details by ID
    boolean updateCustomer(customer customer, int id);

}
