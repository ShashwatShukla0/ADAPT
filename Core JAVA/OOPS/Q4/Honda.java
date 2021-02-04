package assignment.four;

import java.util.*;
abstract class Abs{
	   abstract void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract void disp2();
	}

public class Honda extends Abs{
	 
	   void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String[] args){
	       Honda obj = new Honda();
	       obj.disp2();
	   }
	}