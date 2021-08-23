package lab4.sync;

public class U1901Bank {
    private static int intTo;
    private static int intFrom = 220;

    public void calc(int intTransaction, long lngTimeout) {
        synchronized (U1901Bank.class) {
            System.out.println("[ Before ]\tThread: " + Thread.currentThread().getName() + "\tintFrom: " + intFrom + "\tintTo: " + intTo);
            intFrom -= intTransaction;
            try {
                Thread.sleep(lngTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            intTo += intTransaction;

            System.out.println("[ After ]\tThread: " + Thread.currentThread().getName() + "\tintFrom: " + intFrom + "\tintTo: " + intTo);
        }
    }
}
