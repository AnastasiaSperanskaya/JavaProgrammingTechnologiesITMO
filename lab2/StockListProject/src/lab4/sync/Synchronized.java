package lab4.sync;

//synchronized позволяет "войти в монитор объекта".
//Монитор - это специальный объект, который следит за "состоянием" метода или объекта.
// Он смотрит, "занят" он или "свободен" в данный момент.
//Когда выполнение кода доходит до оператора synchronized, монитор объекта блокируется,
// и на время его блокировки монопольный доступ к блоку кода имеет только один поток,
// который и произвел блокировку.

public class Synchronized {
    public void myMethod()
    {
        Object key = new Object();

        synchronized (key) {
            System.out.println("Hi I'm synchronized block!");
        }
    }

    synchronized void myMethod1() {
        System.out.println("Hi I'm synchronized method!");
    }

    public static class Program {

        public static void main(String[] args) {

            CommonResource commonResource= new CommonResource();
            for (int i = 1; i < 6; i++){

                Thread t = new Thread(new CountThread(commonResource));
                t.setName("Thread "+ i);
                t.start();
            }
        }
    }

    static class CommonResource{

        int x;

        synchronized void increment(){
            x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
                x++;
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException ignored){}
            }
        }
    }

    static class CountThread implements Runnable{

        CommonResource res;
        CountThread(CommonResource res){
            this.res=res;
        }

        public void run(){
            res.increment();
        }
    }
}
