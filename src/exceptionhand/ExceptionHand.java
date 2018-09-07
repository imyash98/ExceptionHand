/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhand;

/**
 *
 * @author YASH
 */
public class ExceptionHand {

    public static void main(String[] args) {
   
    try{
                  System.out.println("Open Files:");
         int n;
        n = args.length;
         System.out.println("n="+n);
        int a=45/n;        
        System.out.println("a="+a);
    
    }
    catch (ArithmeticException ae){
        System.out.println("Input Valid value:?");
        System.out.println(ae);
    }
    finally{
        System.out.println("Close Files.");
    }
    }
    
}
