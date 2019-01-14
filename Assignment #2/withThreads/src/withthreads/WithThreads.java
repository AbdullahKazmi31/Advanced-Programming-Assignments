
package withthreads;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WithThreads {

    public static void main(String[] args) {
        

        double stTime = System.currentTimeMillis(); //starting time calculation
        
        
        Multi1 t1=new Multi1();  //creating object of thread1
        t1.start(); //starting thread
        
        Multi2 t2=new Multi2();  //creating object of thread2
        t2.start();        //starting thread
        
        Multi3 t3=new Multi3();  //creating object of thread3
        t3.start();        //starting thread
        
        //while(t1.isAlive() || t2.isAlive() || t3.isAlive() ){}
        double endTime = System.currentTimeMillis();
        System.out.println("Time ==> " + (endTime - stTime) + " milliseconds"); //calculating time
        }
    }

class Multi1 extends Thread{  
        
    public void run(){  
            
        System.out.println("Thread1 is running...");  
        try {
            
                FileReader fr = new FileReader("C:\\Users\\Computer\\Documents\\NetBeansProjects\\withThreads\\text1.txt"); //reading file
                
                 int i;
                 int count = 0;
                 
                 Hashtable <Character,Integer> hashtable1 = new Hashtable<>(); //initializing hashtable
                
                 while((i=fr.read()) != -1){    //It is used to return a character in ASCII form. It returns -1 at the end of file.
                    if((char)i >=0 && (char)i < 40){
                    
                        if(hashtable1.containsKey((char)i)){
                            hashtable1.put((char)i,hashtable1.get((char)i)+1); //if entry is already present in hashtable
                        }

                        else{
                            hashtable1.put((char)i,1); //if entry is not present in hashtable
                        }
              count++;
                    }
                }
                 System.out.println(hashtable1); //printing hashtable
          fr.close(); //closing file
        } 
        catch (FileNotFoundException ex) {
                System.err.format("This file does not exist.");
            } 
        catch (IOException ex) {
                System.err.format("Read() method error.");
            }
        }  
    }       


class Multi2 extends Thread{  
        
    public void run(){  
            
        System.out.println("Thread2 is running...");  
            
        try {    
                FileReader fr = new FileReader("C:\\Users\\Computer\\Documents\\NetBeansProjects\\withThreads\\text1.txt"); //reading file
                
                 int i;
                 int count = 0;
                 
                 Hashtable <Character,Integer> hashtable2 = new Hashtable<>(); //initializing hashtable
                
                 while((i=fr.read()) != -1){    //It is used to return a character in ASCII form. It returns -1 at the end of file.
                    if((char)i > 39 && (char)i < 80){
                     
                        if(hashtable2.containsKey((char)i)){
                            hashtable2.put((char)i,hashtable2.get((char)i)+1); //if entry is already present in hashtable
                        }

                        else{
                            hashtable2.put((char)i,1); //if entry is not present in hashtable
                        }
              count++;
                    }
                }
                 System.out.println(hashtable2); //printing hashtable
          fr.close(); //closing file
            } 
        catch (FileNotFoundException ex) {
                System.err.format("This file does not exist.");
            } 
        catch (IOException ex) {
                System.err.format("Read() method error.");
            }
        }  
    }


class Multi3 extends Thread{  
        
    public void run(){  
            
        System.out.println("Thread3 is running...");  
            
        try {    
                FileReader fr = new FileReader("C:\\Users\\Computer\\Documents\\NetBeansProjects\\withThreads\\text1.txt"); //reading file
                
                 int i;
                 int count = 0;
                 
                 Hashtable <Character,Integer> hashtable3 = new Hashtable<>();  //initializing hashtable
                
                 while((i=fr.read()) != -1){    //It is used to return a character in ASCII form. It returns -1 at the end of file.
                    if((char)i > 79 && (char)i < 128){
                     
                        if(hashtable3.containsKey((char)i)){
                            hashtable3.put((char)i,hashtable3.get((char)i)+1); //if entry is a;ready present in hashtable
                        }

                        else{
                            hashtable3.put((char)i,1); //if entry is not present in hashtable
                        }
              count++;
                    }
                }
                 System.out.println(hashtable3); //printing hashtable
          fr.close(); //closing file
            } 
        catch (FileNotFoundException ex) {
                System.err.format("This file does not exist.");
            } 
        catch (IOException ex) {
                System.err.format("Read() method error.");
            }
        }  
    }
