package service;

import DaoInterdace.CustomerDao;
import DaoInterdace.CustomerDaoImpl;
import model.customer;
import java.util.*;
import java.util.List;

public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService() {
        // Programming to the interface
        this.customerDao = new CustomerDaoImpl();
    }

    public void getAllCustomers() {
        List<customer> customers = customerDao.getAllCustomers();
        System.out.println("All Customers:");

        for (customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFname() + " " + customer.getLname() + ", Email: " + customer.getEmail());
        }
    }

    public void save() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<customer> customerList = new ArrayList<>();

        System.out.println("Enter the number of customers to add:");
        int numberOfCustomers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCustomers; i++) {
            customer customer = new customer();

            System.out.println("Enter ID for Customer " + (i + 1) + ":");
            customer.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("Enter Email for Customer " + (i + 1) + ":");
            customer.setEmail(scanner.nextLine());

            System.out.println("Enter First Name for Customer " + (i + 1) + ":");
            customer.setFname(scanner.nextLine());

            System.out.println("Enter Last Name for Customer " + (i + 1) + ":");
            customer.setLname(scanner.nextLine());

            customerList.add(customer);
        }

        customerDao.saveCustomer(customerList);
        System.out.println("Customers saved successfully.");
    }

    public void updateCustomer() {
        Scanner scanner = new Scanner(System.in);
        customer updateCustomer = new customer();

        System.out.println("Enter the ID of the customer to update:");
        int customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the new First Name: ");
        updateCustomer.setFname(scanner.nextLine());

        System.out.print("Enter the new Last Name: ");
        updateCustomer.setLname(scanner.nextLine());

        System.out.print("Enter the new Email: ");
        updateCustomer.setEmail(scanner.nextLine());

        updateCustomer.setId(customerId);

        boolean isUpdated = customerDao.updateCustomer(updateCustomer, customerId);
        if (isUpdated) {
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Customer update failed. Please check the ID.");
        }
    }

    public void deleteCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the customer to delete:");
        int customerId = Integer.parseInt(scanner.nextLine());

        boolean isDeleted = customerDao.deleteCustomer(customerId);
        if (isDeleted) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer deletion failed. Please check the ID.");
        }
    }
}
