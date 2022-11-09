/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacollections;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author student
 */
public class Setcollection {
    
 static Scanner o = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        
       HashSet s1= new  HashSet();
       s1.add(234);
       s1.add(24);
       s1.add(56);
       
       for(Object o : s1 )
       {
           System.out.println(o);   
       }
       
       TreeMap tm = new TreeMap();
       tm.put(121, "Shyam balarji");
       tm.put(21, "Shva shankar");
       tm.put(1, "punitha p");
       
       
       System.out.println("Iterator Approach :- ");
       Iterator iit = tm.keySet().iterator();
       while(iit.hasNext())
       {
           Object key=iit.next();
           Object value=tm.get(key);
           System.out.println(key+" "+value);
           
       }
       System.out.println("For each iterator :");
       Set ss=tm.keySet();
       for(Object var : ss)
       {
           System.out.println(var+" "+tm.get(var) );
       }
       

    }
    
}
