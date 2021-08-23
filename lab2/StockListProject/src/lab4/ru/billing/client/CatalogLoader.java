package lab4.ru.billing.client;

import lab4.ru.billing.exceptions.CatalogLoadException;
import lab4.ru.billing.exceptions.ItemAlreadyExistsException;
import lab4.ru.billing.stocklist.ItemCatalog;

public interface CatalogLoader {

    public void load(ItemCatalog catalog) throws CatalogLoadException, ItemAlreadyExistsException;
}