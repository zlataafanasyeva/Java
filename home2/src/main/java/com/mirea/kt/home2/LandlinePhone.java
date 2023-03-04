/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home2;

/**
 *
 * @author afana
 */
public class LandlinePhone extends Phone {
    private String cabel;
    private String number;

        public LandlinePhone(String cabel, String number, int price, double weight, int guaranty, String brend, String colour) {
            super(brend, colour, price, weight, guaranty);
            this.cabel = cabel;
            this.number = number;
        }

public void stand (){
        System.out.println("stadding...");
    }
public void beNice (){
        System.out.println("beautiful...");
    }
public void zaruad (){
        System.out.println("give me energy...");
    }  
  
    
    @Override
    public String toString() {
        return "LandlinePhone{" + "brend= " + brend + ", colour= " + colour + ", price= " + getprice() + ", weight= " + getweight() + ", quaranty= " + getguaranty() + ", cabel=" + cabel + ", number= " + number + '}';
    }

}
