/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
import java.lang.*;



class enentra extends Thread
{
    public void run ()
    {
        try {
            
           for(int i=0; i<=2; i++)
        {
            System.out.println("Enentra Event ");
        }
           
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }

    
    
}

class Enignma extends Thread
{
    public void run()
    {
        try
        {
           for (int i=0; i<=2; i++)
        {
            System.out.println("Enigma Event ");
        }
           
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }  
}

class samitha extends Thread 
{
    public void run()
    {
        try
        {
            for (int i=0; i<=2; i++)
        {
            System.out.println("Shamitha Event ");
        }
            
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
        
    }  
}

        

public class Priority 
{
    
    public static void main(String a[]) throws InterruptedException
    {
        
        System.out.println("SET Prirority ");
        enentra t1e = new enentra();
        Enignma t2E = new Enignma();
        samitha t3s = new samitha();
        
        t1e.setName("ENENTHRA ");
        t2E.setName("ENIGNMA");
        t3s.setName("SHANMITHA");
        
        t1e.setPriority(Thread.MIN_PRIORITY);
        t2E.setPriority(Thread.MAX_PRIORITY);
        t3s.setPriority(Thread.NORM_PRIORITY);
        
        t1e.start();
        t2E.start();
        t3s.start();
        
        
        
    }
    
}
