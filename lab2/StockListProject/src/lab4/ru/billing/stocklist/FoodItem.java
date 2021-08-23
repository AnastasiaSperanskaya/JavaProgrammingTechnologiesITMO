package lab4.ru.billing.stocklist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodItem extends GenericItem implements Cloneable{
    private Date dateOfIncome; // дата производства
    private short expires; // срок годности

    public short getExpires() { return expires; }
    public void setExpires(short expires) { this.expires = expires; }

    public Date getDateOfIncome() { return dateOfIncome; }
    public void setDateOfIncome(Date dateOfIncome) { this.dateOfIncome = dateOfIncome; }

    public FoodItem() {
    }

    public FoodItem(String name, float price, FoodItem analog, Date dateOfIncome, short expires) {

        super(name, price, analog);
        setCategory(Category.FOOD);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) { super(name, price, Category.FOOD); this.expires = expires; }

    public FoodItem(String name) { super(name); setCategory(Category.FOOD); }

    @Override
    void printAll() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(this.dateOfIncome);
        super.printAll();
        System.out.printf("date of income: %s , expires: %d \n", strDate, expires);
    }

    @Override
    public boolean equals(Object o) {
        FoodItem item = (FoodItem) o;
        return super.equals(item) && (this.expires == item.expires) && (this.dateOfIncome.equals(item.dateOfIncome));
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return (FoodItem) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + String.valueOf(this.dateOfIncome) + ", " +
                String.valueOf(this.expires);
    }
}
