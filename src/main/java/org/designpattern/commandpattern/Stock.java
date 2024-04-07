package org.designpattern.commandpattern;

public class Stock {
   
    private String name = "lyyABC";
    private int quantity = 20;
  
    public void buy(){
       System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
       System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
 }
