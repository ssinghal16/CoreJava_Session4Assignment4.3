/*Write a program in java to demonstrate the use of final keyword with class, with the method, with
the constructor, and with a variable.
*/

package com.acadgild.assignment;  //package declaration 

//with the method
class Xyz{  
	   final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
		     
	class Demo extends Xyz{  
	   public static void main(String args[]){  
	      Demo obj= new Demo();  
	      obj.demo();  
	   }  
	}