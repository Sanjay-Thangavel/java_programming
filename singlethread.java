/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacollections;
import java.util.*;
import java.lang.*;

/**
 *
 * @author student
 */
public class singlethread implements Runnable{

    public void run()
    {
        System.out.println("Welocme ");
    }
    public static void main(String[] args) 
    {
        System.out.println("========= Single thread ======");
        
       singlethread obj=new singlethread();
       Thread t1=new Thread(obj);
       t1.start();
                
    } 
   
    
    
}
