/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author Sanjay T
 */
public class FileChar 
{
    static Scanner ob  = new Scanner(System.in);
    
    String path = "charfile.txt";
    File f = new File(path);
   
   
    public void create()
    {
        try
        {
           FileWriter fw = new FileWriter(f);
           System.out.println("entre msg");
           fw.write(ob.nextLine());
           fw.close();
           System.out.println("Writern into file ");
        }
        catch (Exception e)
        {
           System.out.println(e.getMessage()); 
        }
        
    }
    public void display()
    {
        try {
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            
            String s;
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
            br.close();
            
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() );
            
        }
    }
    
    public static void main(String [] a)
    {
        FileChar f1 = new FileChar ();
        System.out.println("File Path :"+f1.f.getAbsolutePath());
        f1.create();
        f1.display();
        System.out.println("Displayed---");
        
    } 
}
