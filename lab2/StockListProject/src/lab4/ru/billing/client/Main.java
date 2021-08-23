package lab4.ru.billing.client;

import lab4.ru.billing.exceptions.CatalogLoadException;
import lab4.ru.billing.exceptions.ItemAlreadyExistsException;
import lab4.ru.billing.stocklist.Category;
import lab4.ru.billing.stocklist.FoodItem;
import lab4.ru.billing.stocklist.GenericItem;
import lab4.ru.billing.stocklist.ItemCatalog;


import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws ItemAlreadyExistsException {
        ItemCatalog catalog = new ItemCatalog();

        FoodItem food1 = new FoodItem("food1");
        catalog.addItem(food1);
        FoodItem food2 = new FoodItem("food2");
        catalog.addItem(food2);
        FoodItem food3 = new FoodItem("food3");
        catalog.addItem(food3);
        FoodItem food4 = new FoodItem("food4");
        catalog.addItem(food4);
        FoodItem food5 = new FoodItem("food5");
        catalog.addItem(food5);
        FoodItem food6 = new FoodItem("food6");
        catalog.addItem(food6);
        FoodItem food7 = new FoodItem("Fuze-Tea");
        catalog.addItem(food7);
        GenericItem generic8 = new GenericItem("Pepsi", 45.0f, Category.FOOD);
        catalog.addItemExtra(generic8);
        GenericItem generic9 = new GenericItem("Lipton", 56.0f, Category.FOOD);
        catalog.addItemExtra(generic9);
        GenericItem generic10 = new GenericItem("generic13", 10.0f, Category.GENERAL);
        catalog.addItem(generic10);

        long begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
            catalog.findItemByID(10);

        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
            catalog.findItemByIDAL(10);

        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
        System.out.println();
        catalog.printItems();

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(catalog);
        System.out.println();
        catalog.printItems();

        System.out.println();
        System.out.println(catalog.findItemByIDExtra(1));
        catalog.removeItemByIDExtra(1);
        System.out.println();
        catalog.printItems();
        System.out.println();
        HashMap<Integer, GenericItem> search = catalog.searchByPriceAndCategoryExtra(45.0f, Category.FOOD);

        ItemCatalog catalog1 = new ItemCatalog();

        CatalogFileLoader catalogFileLoader =
                new CatalogFileLoader("/Users/anastasia/Desktop/ТехнологииПрограммирования/lab2/StockListProject/src/lab4/ru/billing/client/items.lst");
        try {
            catalogFileLoader.load(catalog1);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }

        catalog1.printItems();

    }
}
