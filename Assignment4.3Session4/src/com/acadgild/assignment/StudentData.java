/*Write a program in java to demonstrate the use of final keyword with class, with the method, with
the constructor, and with a variable.
*/

package com.acadgild.assignment;  //package declaration 

//With Variable and with constructor 
class StudentData{  
	   //Blank final variable
	   final int ROLL_NO;
		 
	   StudentData(int rnum){
	      //It must be initialized in constructor
	      ROLL_NO=rnum;
	   }
	   void myMethod(){  
	      System.out.println("Roll no is:"+ROLL_NO);
	   }  
	   public static void main(String args[]){  
	      StudentData obj=new  StudentData(1234);  
	      obj.myMethod();  
	   }  
	}