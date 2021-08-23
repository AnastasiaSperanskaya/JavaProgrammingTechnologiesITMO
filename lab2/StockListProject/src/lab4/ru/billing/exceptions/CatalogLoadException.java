package lab4.ru.billing.exceptions;

import java.io.FileNotFoundException;

public class CatalogLoadException extends RuntimeException {

    public CatalogLoadException() { }

    public CatalogLoadException(ItemAlreadyExistsException e) { }

    public CatalogLoadException(FileNotFoundException e) { }
}