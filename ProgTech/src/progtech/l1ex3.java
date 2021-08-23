package progtech;

public class l1ex3 {
    public static void main(String[] args) {

        //1
        for (char c = 97; c <= 122; c++) {
            System.out.print(c + " ");

        }
        for (char c = 'i'; c <= 's'; c++) {
            System.out.print(c + " ");

        }
        System.out.println();
        //2
        long begin = new java.util.Date().getTime();
        int i = 0;
        while (i < 100000000)
        {
            i++;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end - begin);

        begin = new java.util.Date().getTime();
        long j = 0;
        while (j < 100000000)
        {
            j++;
        }
        end = new java.util.Date().getTime();
        System.out.println(end - begin);
    }
}
