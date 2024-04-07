package com.vikrant.problems;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 19, 2024
 *  time:2:15:08 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class Test1 { 
    public static void main(String[] args) { 
       Dog dog = new Dog(); 
       dog.voice("bark"); 
    } 
} 
class Animal { 
    public void voice(String voice) { 
        System.out.println(voice); 
    } 
    Animal(int voice) {  } 
    Animal(int a, int b){}
} 
class Dog extends Animal { 
    Dog() {  
    	//super(12);
    	super(12,13);
  
    } 
    public void voice(String voice) { 
        System.out.println(voice); 
    } 
} 
