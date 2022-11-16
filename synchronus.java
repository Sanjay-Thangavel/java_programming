/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacollections;

import java.lang.*;
import java.util.*;

class Thread1 extends Thread
{
    public void run()
    {
        synchronus.exec();
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
         synchronus.exec();
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
public class synchronus {

    
    static void exec()
    {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name+"\n");
    }
   
    public static void main(String[] args) 
    {
        Thread1 ob1 = new Thread1();
        
        Thread2 ob2 = new Thread2();
        
        ob1.setName("NEw_THREAD1");
        ob2.setName("New_thread2");
        
        
        ob2.start();
        ob1.start();
    
    }
    
}
