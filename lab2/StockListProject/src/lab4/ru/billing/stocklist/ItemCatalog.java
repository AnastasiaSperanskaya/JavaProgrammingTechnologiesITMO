package lab4.ru.billing.stocklist;

import lab4.ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

class Pair<T, P> {

    private T key;
    public T getKey() { return key; }

    private P value;
    public P getValue() { return value; }

    public Pair(T key, P value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (key != null ? key.hashCode() : 0);
        hash = 31 * hash + (value != null ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Pair pair = (Pair) o;
        if (key != null ? !key.equals(pair.key) : pair.key != null) return false;
        return value != null ? value.equals(pair.value) : pair.value == null;
    }
}

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        if(catalog.containsKey(item.getID()) || ALCatalog.contains(item))
            throw new ItemAlreadyExistsException();
        else {
            catalog.put(item.getID(), item); // Добавляем товар в HashMap
            ALCatalog.add(item); // Добавляем тот же товар в ArrayList
        }
    }

    public void printItems(){
        for(GenericItem i : catalog.values()){
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id){
    //Если нет такого ID, возвращаем пустое значение
        if(!catalog.containsKey(id)) {
            return null;
        } else{
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id){
        for(GenericItem i : ALCatalog){
            if(i.getID()==id) return i;
        }
        return null;
    }

    private HashMap<Pair<Float, Category>, HashMap<Integer, GenericItem>> extra = new HashMap<>();

    public void addItemExtra(GenericItem item) {
        Pair<Float, Category> pair = new Pair<>(item.getPrice(), item.getCategory());

        catalog.put(item.getID(), item);
        if(extra.containsKey(pair))
            extra.get(pair).put(item.getID(), item);
        else {
            HashMap<Integer, GenericItem> hashmap = new HashMap<>();
            hashmap.put(item.getID(), item);
            extra.put(pair, hashmap);
        }
    }

    public GenericItem findItemByIDExtra(int id) {
        return catalog.getOrDefault(id, null);
    }

    public void removeItemByIDExtra(int id) {
        extra.get(new Pair<>(catalog.get(id).getPrice(), catalog.get(id).getCategory())).remove(id);
        catalog.remove(id);
    }

    public HashMap<Integer, GenericItem> searchByPriceAndCategoryExtra(Float price, Category category) {

        System.out.println(extra.get(new Pair<>(price, category)));
        return extra.get(new Pair<>(price, category));
    }
}
