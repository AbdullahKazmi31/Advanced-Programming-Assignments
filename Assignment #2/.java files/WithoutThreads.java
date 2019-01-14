
package withoutthreads;

import java.lang.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
/**
 *
 * @author Computer
 */
public class WithoutThreads {

    public static void main(String[] args) throws Exception {
        try{
            
        double stTime = System.currentTimeMillis();
        
        FileReader fr = new FileReader("C:\\Users\\Computer\\Documents\\NetBeansProjects\\withoutThreads\\text1.txt");    //reading file
          int i;
          int count = 0;
          Hashtable <Character,Integer> hashtable1 = new Hashtable<>(); //initializing hashtable
          while((i=fr.read())!=-1){    //It is used to return a character in ASCII form. It returns -1 at the end of file.
          
              if(hashtable1.containsKey((char)i)){
                  hashtable1.put((char)i,hashtable1.get((char)i)+1); //if entry is already in hashtable
                }

              else{
              hashtable1.put((char)i,1); //if entry is not in hashtable
              }
              count++;
            }
          System.out.println();
          System.out.println(hashtable1); //printing time
          System.out.println();
          System.out.println("Total number of characters " + count + ".");
          fr.close(); //closing file
          
          double endTime = System.currentTimeMillis();
          System.out.println("Time ==> " + (endTime - stTime) + " milliseconds"); //calculating time
        }
        catch(FileNotFoundException e){
            System.err.format("This file does not exist."); //if file does not exist throw this exception
        }
        
        
    }
    
}
