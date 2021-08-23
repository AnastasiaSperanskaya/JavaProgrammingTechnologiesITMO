package lab4.ru.billing.stocklist;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class GenericItem implements Cloneable {

    private int ID; // ID товара
    private String name; // Наименование товара
    private float price; //Цена товара
    private GenericItem analogItem; //товар, являющийся аналогом
    private static int currentID = 0;

    public Category category = Category.GENERAL;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analogItem;
    }

    public void setAnalog(GenericItem analogItem) {
        this.analogItem = analogItem;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public GenericItem() {
    }

    public GenericItem(String name) {
        this.name = name;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;

        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analogItem) {
        this.name = name;
        this.price = price;
        this.analogItem = analogItem;

        this.ID = GenericItem.currentID++;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %s , price: %5.2f , category: %s \n",ID,name,price,category);
    }

    @Override
    public boolean equals(Object o) {
        GenericItem item = (GenericItem) o;
        return Objects.equals(this.name, item.name)&&(this.price == item.price)&&(this.category.equals(item.category));
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream ous = new ObjectOutputStream(baos);

            ous.writeObject(this);
            ous.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            GenericItem clone = (GenericItem) ois.readObject();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.ID) + ", " + this.name + ", " + String.valueOf(this.price) + ", " +
                String.valueOf(this.category);
    }

}