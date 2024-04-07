package com.vikrant.prac;

public class Show { 
int calc() { 
try { 
         return 10; 
      } catch(Exception e) { 
         return 20; 
      } finally { 
         return 30; 
      } 
   } 
   public static void main(String[] args) { 
	   Show cr = new Show(); 
      System.out.println(cr.calc()); 
   } 
 
} 