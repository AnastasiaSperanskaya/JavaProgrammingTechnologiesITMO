public class Main{
    //main
    public static void main(String[] args){
        System.out.println("Starting project"); //output

        byte v_byte = 120; //целые числа, 1 байт
        short v_short = 129; //целые числа, 2 байта
        char v_char = 'a'; //char v_char = a; символ Unicode, 2 байта
        int v_int = 65999; //целые числа, 4 байта
        long v_long = 429496; //long v_long = 4294967296; целые числа, 8 байт
        float v_float = 0.3; //float v_float = 0.33333334; вещественные числа, 4 байта
        double v_double = 0.3333333333333333; //вещественные числа, 8 байтов
        // (-1)^s × M × B^E, где s — знак, B-основание, E — порядок, а M — мантисса.
        boolean v_boolean = true; //значение истина/ложь, 1 байт

        System.out.println("This is a byte: " + v_byte);
        System.out.println("This is short: " + v_short);
        System.out.println("This is char: " + v_char);
        System.out.println("This is int: " + v_int);
        System.out.println("This is long: " + v_long);
        System.out.println("This is float: " + v_float);
        System.out.println("This is double: " + v_double);
        System.out.println("This is boolean: " + v_boolean);
    }
}
