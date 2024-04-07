package com.vikrant.prac;

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
    Animal()
    {}
    Animal(String voice) {  } 
} 
class Dog extends Animal { 
    Dog() {   } 
    public void voice(String voice) { 
        System.out.println(voice); 
    } 
}