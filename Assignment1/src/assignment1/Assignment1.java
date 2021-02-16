/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Mike
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       for(int i =0; i < 101; i++) //loop for printing even numbers 0-100
       {
           if(i % 2 == 0) // checks if i is an even number
               System.out.println(i); //prints out i if it is an even number on a new line
       }
    }
    
}
