/*Write a program in java to demonstrate the use of final keyword with class, with the method, with
the constructor, and with a variable.
*/

package com.acadgild.assignment;  //package declaration 

//With class

final class DemoFinalClass{  
	  void demo(){
      System.out.println("My Method");
   }
	   
       public static void main(String args[]){  
		   DemoFinalClass obj= new DemoFinalClass(); 
	       obj.demo();
	   }  
	}
