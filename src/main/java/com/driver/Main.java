package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      // Error: Cannot access private member 'name' from outside the class
      // obj.name = "Parth";

      // Error: Cannot access private member 'name' from outside the class
      // System.out.println(obj.name);
      obj.setName("parth");
      System.out.println(obj.getName());
  }
}