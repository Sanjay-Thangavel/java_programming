/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author student
 */
public class classthread extends Thread{

   
    public void run()
    {
      System.out.println("INside run functions ");
    }
    
    public static void main(String[] args) {
        classthread born  = new classthread();
        born.start();
        
    }
    
}
