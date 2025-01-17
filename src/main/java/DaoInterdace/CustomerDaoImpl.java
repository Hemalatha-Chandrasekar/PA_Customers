package DaoInterdace;

import model.customer;
import model.item;
import utility.connectionDAO;

import java.sql.Connection;
import java.util.List;

public class CustomerDaoImpl  extends connectionDAO implements CustomerDao {


    /**
     * @return
     */
    @Override
    public List<customer> getAllCustomers() {
        return List.of();
    }

    /**
     * @param customerList
     */
    @Override
    public void saveCustomer(List<customer> customerList) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    /**
     * @param customer
     * @param id
     * @return
     */
    @Override
    public boolean updateCustomer(customer customer, int id) {
        return false;
    }
}
