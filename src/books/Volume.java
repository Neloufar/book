/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package books;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author neliloghmani
 */


public class Volume {
    String volumeName;
    int numberOfbooks;
    Book[] books;    //declares variables
    
  public Volume(String volumeName, int numberOfbooks, Book books[])
  {
      this.volumeName = volumeName;
      this.numberOfbooks = numberOfbooks;   
      this.books = books;
     
  }
  public Book[] getBookArray()
  {
      return books;     //returns array of books
  }
   public String toString ()
   {
       //output of class; and the Array.toString converst the array to a string
 return "\n\nVolume Name " + volumeName + "\n Number of Books: " +
         numberOfbooks + "\n Book Information:" + Arrays.toString(books); 
 
   
}
}




