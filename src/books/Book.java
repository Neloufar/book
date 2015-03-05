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

public class Book {

    /**
     * @param args the command line arguments
     */
     String title ;
     String author ;       //declares variables
    int numberOfpages;
    
 public Book(String title, String author, int numberOfpages)
 {
     this.title = title;
     this.author = author;
     this.numberOfpages = numberOfpages;
 }
 public void SetTitle (String title)
 {
     this.title = title;  // sets variable from user input in Demo class
 }
 public String GetTitle ()
 {
     return title;   //allows retreival of title
 }
  public void SetAuthor (String author)
 {
     this.author = author;
 }
 public String GetAuthor ()
 {
     return author;
 }
  public void SetPages (int numberOfpages)
 {
     this.numberOfpages = numberOfpages;
 }
 public int GetPages ()
 {
     return numberOfpages;
 }
 
 public String toString()
 {
        
 return  "\nTitle: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + numberOfpages + "";
                 
         }
    
}
