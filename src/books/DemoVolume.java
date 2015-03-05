/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package books;

import java.util.Scanner;

/**
 *
 * @author neliloghmani
 */
public class DemoVolume {
    
    public static void main (String[] args)
    { 
        String title;
        String author;    //declaring variables
        int numberOfPages;
        
        Scanner kbd = new Scanner(System.in);

        System.out.println("How many books are in this volume?");
        int numberOfBooks = kbd.nextInt();
        Book[] books; //declaring array
        books = new Book[numberOfBooks]; // initializing array with input from user
   for (int i = 0; i < numberOfBooks; i++) // number of books must be greater then or equal to 1
   {
   
        System.out.println("Enter Book Title: ");
        title = kbd.next();
        
        
        System.out.println("Enter Book Author: ");       //allows user input
        author = kbd.next();
        
        System.out.println("Enter number of pages: ");
        numberOfPages = kbd.nextInt();
       
        Book book1 = new Book(title,author,numberOfPages);    //creates object 
        books[i] = book1;
    
   } 
   
        
    System.out.println("Enter Volume Name");
    String volumeName = kbd.next();
    Volume volume1 = new Volume(volumeName, numberOfBooks, books);  //creates object
    System.out.println(volume1.toString());  //takes obkect to string in (Volume)
   
    
    
   
  
   
    
}
}
