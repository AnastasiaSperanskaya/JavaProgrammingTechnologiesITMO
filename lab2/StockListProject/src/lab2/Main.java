package lab2;

import java.util.Calendar;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        GenericItem first = new GenericItem();
        GenericItem second = new GenericItem();
        GenericItem third = new GenericItem();

        first.ID = 1;
        second.ID = 2;
        third.ID = 3;

        first.name = null;
        second.name = "earphones";
        third.name = "powerbank";

        first.price = 23990.55f;
        second.price = 13990f;
        third.price = 1250.69f;

        if(first.equals(second)) System.out.println("first = second");
        else System.out.println("first != second");
        
        /*first.printAll();
        second.printAll();
        third.printAll();

        FoodItem potato = new FoodItem();
        potato.ID = 4;
        potato.name = "potato";
        potato.price = 0.99f;
        potato.dateOfIncome = Calendar.getInstance().getTime();
        potato.expires = 2;

        TechnicalItem polaroid = new TechnicalItem();
        polaroid.ID = 5;
        polaroid.name = "Polaroid";
        polaroid.price = 4990f;
        polaroid.warrantyTime = 2;

        GenericItem[] arrayOfItems = new GenericItem[2];
        arrayOfItems[0] = potato;
        arrayOfItems[1] = polaroid;

        for(int i = 0; i < 2; i++){
            arrayOfItems[i].printAll();
        }

        FoodItem carrot = new FoodItem();
        carrot.name = "Carrot";

        if(potato.equals(carrot)) System.out.println("Potato equals Carrot");
        else System.out.println("Potato not equals Carrot");

        FoodItem o = (FoodItem) potato.clone();
        if(potato.equals(o)) System.out.println("Potato equals it's clone");

        System.out.println(potato.toString());

        //2-3
        GenericItem original = new GenericItem();
        GenericItem analog = new GenericItem();
        analog.name = "test";
        original.analogItem = analog;
        GenericItem clone = (GenericItem) original.cloneExtended();
        System.out.println(clone.toString());
        System.out.println(original.toString());

         */
    }
}
