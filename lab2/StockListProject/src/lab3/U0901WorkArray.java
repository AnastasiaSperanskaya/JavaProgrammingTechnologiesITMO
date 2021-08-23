package lab3;

import java.util.function.Supplier;

public class U0901WorkArray<T extends Number> {

    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    double sum() {
        double doubleWork = 0;
        for (T x : arrNums) {
            doubleWork += x.doubleValue();
        }
        return doubleWork;
    }
}
