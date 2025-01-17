package DaoInterdace;

import model.item;
import utility.connectionDAO;

import java.util.List;

public class itemDaoImpl extends connectionDAO implements itemDao {


    /**
     * @return
     */
    @Override
    public List<item> getAllItems() {
        return List.of();
    }

    /**
     * @param itemList
     */
    @Override
    public void saveItem(List<item> itemList) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteItem(int id) {
        return false;
    }

    /**
     * @param item
     * @param id
     * @return
     */
    @Override
    public boolean updateItem(item item, int id) {
        return false;
    }
}
