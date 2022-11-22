/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
import java.util.*;


/**
 *
 * @author Sanjay T
 */
public class FileBytes{
    
    static Scanner ob = new Scanner(System.in);
    
    
       String currentPath = "sanjay.txt";
       File f = new File(currentPath);
       
       String msg;
       public void acceptmsg()
       {
           System.out.println("Entre your msg");
           msg = ob.nextLine();
       }
        
       FileInputStream fi;
       FileOutputStream fo;
       
       public void createNewfile()
       {
           
           
           try
           {
               
               fo = new FileOutputStream(f);
               
               byte[] arr =msg.getBytes();
               
               fo.write(arr);
               
               fo.close();
               System.out.println("file has been creatred ");
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
       }
       
       //fi
     public void displayfile()
     {
         try
         {
            fi = new FileInputStream(f);
            int br;
            System.out.println("Displaying content of files");
            System.out.println("Total round :"+fi.available());
           
            while((br=fi.read())!=-1)
            {
               System.out.println((char)br);
            }
            fi.close();
            
            //Method 2
             
         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
         
         
     }
       
    public static void main(String[] args) 
    {
        
        System.out.println("Byte Stream -- Input and Output");
      FileBytes object = new FileBytes ();
      object.acceptmsg();
      object.createNewfile();
      object.displayfile();
       
    }
    
}
