package DaoInterdace;

import model.item;

import java.util.List;

public interface itemDao {

    // Method to retrieve all items
    List<item> getAllItems();

    // Method to save a list of items
    void saveItem(List<item> itemList);

    // Method to delete an item by ID
    boolean deleteItem(int id);

    // Method to update item details by ID
    boolean updateItem(item item, int id);

}
