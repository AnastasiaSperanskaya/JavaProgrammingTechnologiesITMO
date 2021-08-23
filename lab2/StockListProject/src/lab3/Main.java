package lab3;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        GenericItem analog = new GenericItem("MntnDew", 45.0f, GenericItem.Category.FOOD);
        analog.printAll();
        System.out.println();

        String line = "Конфеты ’Маска’;45;120";

        line = line.trim();
        String[] item_fld = line.split("[\\s]*[;]+[\\s]*");
        System.out.println(Arrays.toString(item_fld));
        FoodItem newItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        newItem.printAll();
    }
}
