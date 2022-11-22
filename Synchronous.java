
import java.lang.*;
import java.util.*;

class Thread1 extends Thread
{
    public void run()
    {
        Synchronous.exec();
        try
        {
          //int i=0;
           for(int i=0; i<=4; i++)
           {
              Thread.sleep(500);
               System.out.println("THread 1 : -> "+i);
           }
            
        }
        catch(Exception e)
                {
                    System.out.println("Thread 1 interrupted.."+e);
                }
    }
}

class Thread2 extends Thread 
{
    public void run()
    {
         Synchronous.exec();
        try 
        {
        for(int i=0; i<=4; i++)
        {
            Thread.sleep(1000);
            System.out.println("Thread 2 : -->"+i);
         
        }
        
        }
        catch (Exception n)
        {
             System.out.println("Thread 2 interrupted.."+n);
        }
        
    }
}

public class Synchronous {

    
    static void exec()
    {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name+"\n");
    }
   
    public static void main(String[] args) throws InterruptedException 
    {
        Thread1 ob1 = new Thread1();
        
        Thread2 ob2 = new Thread2();
        
        
        ob1.setName("NEw_THREAD1");
        ob2.setName("New_thread2");
        
        
        ob1.start();
        ob1.join();
        System.out.println("End of 1  Thread ");
        
        
        
        ob2.start();
        //ob1.join();
        ob2.join();
        System.out.println("End of 2 Thread");
        
        
    
    }
    
}