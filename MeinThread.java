/**
 * Created with IntelliJ IDEA.
 * User: teri
 * Date: 12.11.13
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */


public class MeinThread implements Runnable{
    static final Object schluessel=new Object();

    public  void run(){
        synchronized (schluessel){
        for (int i=0;i<10;i++){
         try{
             Thread.sleep(1000);
         }catch(InterruptedException e)  {}
            System.out.println(Thread.currentThread().getName()+" "+ i);
      }
        }
    }

    public static void main(String[] args){
        Thread t0=new Thread(new MeinThread());
        t0.setName("T0");
        t0.start();
        Thread t1=new Thread(new MeinThread());
        t1.setName("T1");
        t1.start();
    }
}
