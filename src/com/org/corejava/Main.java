package com.org.corejava;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String [] args) {
    // note:
    // this is just an example on how our system
    // takes input and output and automate the process
    // of marking this submission
    try {
      Scanner scan = new Scanner(System.in);
      
      // check if there is any more line
      if (scan.hasNextLine()) {
        // here's how you read the next line
        String string = scan.nextLine();
        
        // here's how you output the result
        System.out.println(string);
      }
    
    } catch (Exception e) {
    }
  }
}