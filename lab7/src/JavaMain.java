import java.math.BigDecimal;

public class JavaMain {
    public static void main(String[] args) {

        String a = "hello";
        //System.out.println(firstDec instanceof Integer);
        Integer b = 1;
        //System.out.println(secondDec instanceof String);

        System.out.println(b instanceof Integer);
        System.out.println(a instanceof String);

        BigDecimal firstDec = new BigDecimal(10);
        BigDecimal secondDec = new BigDecimal(10);

        System.out.println(firstDec + " add " + secondDec + " = " + firstDec.add(secondDec));
        System.out.println(firstDec + " divide " + secondDec + " = " + firstDec.divide(secondDec));
        System.out.println(firstDec + " multiply " + secondDec + " = " + firstDec.multiply(secondDec));

//        System.out.println(firstDec + " + " + secondDec + " = " + (firstDec + secondDec));
//        System.out.println(firstDec + " / " + secondDec + " = " + firstDec / secondDec);
//        System.out.println(firstDec + " * " + secondDec + " = " + firstDec * secondDec);
    }
}
