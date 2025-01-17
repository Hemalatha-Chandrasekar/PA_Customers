package service;

import DaoInterdace.itemDao;
import DaoInterdace.itemDaoImpl;
import model.item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemService {
    private final itemDao itemDao;

    public ItemService(itemDao itemdao) {
        DaoInterdace.itemDao itemDao1;
        itemDao1 = itemdao;
        // Programming to the interface
        itemDao1 = new itemDaoImpl();
        this.itemDao = itemDao1;
    }

    public void getAllItems() {
        List<item> items = itemDao.getAllItems();
        System.out.println("All Items:");

        for (item item : items) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }

    public void save() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<item> itemList = new ArrayList<>();

        System.out.println("Enter the number of items to add:");
        int numberOfItems = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfItems; i++) {
            item item = new item();

            System.out.println("Enter ID for Item " + (i + 1) + ":");
            item.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("Enter Name for Item " + (i + 1) + ":");
            item.setName(scanner.nextLine());

            System.out.println("Enter Price for Item " + (i + 1) + ":");
            item.setPrice(new BigDecimal(scanner.nextLine()));

            itemList.add(item);
        }

        itemDao.saveItem(itemList);
        System.out.println("Items saved successfully.");
    }

    public void updateItem() {
        Scanner scanner = new Scanner(System.in);
        item updateItem = new item();

        System.out.println("Enter the ID of the item to update:");
        int itemId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the new Name: ");
        updateItem.setName(scanner.nextLine());

        System.out.print("Enter the new Price: ");
        updateItem.setPrice(new BigDecimal(scanner.nextLine()));

        updateItem.setId(itemId);

        boolean isUpdated = itemDao.updateItem(updateItem, itemId);
        if (isUpdated) {
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Item update failed. Please check the ID.");
        }
    }

    public void deleteItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the item to delete:");
        int itemId = Integer.parseInt(scanner.nextLine());

        boolean isDeleted = itemDao.deleteItem(itemId);
        if (isDeleted) {
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Item deletion failed. Please check the ID.");
        }
    }
}
