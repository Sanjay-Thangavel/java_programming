/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacollections;
import java.io.*;
import java.util.*;

public class ListCollections{
    
   static void pri(ArrayList am)
   {
       
       for(int i=0; i<am.size();i++)
       {
           System.out.println(am.get(i) );
       }
       
   }
   
  
    static Scanner ob = new Scanner(System.in);

    public static void main(String[] args) 
    {
       System.out.println("Entre no of elelmetns :");
       int n =ob.nextInt();
       ArrayList al = new ArrayList();
       
       for(int i=0; i<n; i++)
       {
           int num;
           System.out.println("ENtre the element :"+ i+1 );
           num=ob.nextInt();
           al.add(num);
           al.add("heeloo");
       }
         al.get(2);
          pri(al);
       // al.clear();
        pri(al);
     
       Vector<String> vcc = new Vector <String>();
       vcc.addElement("Welcome");
       
       for(Object var : vcc)
       {
        System.out.println(var);
       }
       
       LinkedList <String> l1 = new LinkedList<String>();
      
       l1.add("linked1");
       l1.add(1,"linked0");
       
       l1.addLast("Lasting");
       System.out.println("Printing all");
       System.out.println(l1);
       System.out.println("using iterator");
       Iterator it = l1.iterator();
       while(it.hasNext())
       {
             System.out.println(it.next() );
       }
         
       l1.remove(0);
       for( ;it.hasNext();)
       {
           System.out.println(it.next() );
       }
       System.out.println(l1.size() );  
       
    }
  
       
}
