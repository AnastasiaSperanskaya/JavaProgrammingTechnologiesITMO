package lab2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class FoodItem extends GenericItem implements Cloneable{
    Date dateOfIncome; // дата производства
    short expires; // срок годности

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
