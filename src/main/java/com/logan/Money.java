package com.logan;

import java.util.Scanner;

public class Money {
    private int usd = 1;
    private String usdSymbol = "$";

    private double eur = .8;
    private String eurSymbol = "€";

    private double jpy = 110.8;
    private  String jpySymbol = "¥";

    private double bit = .0028;
    private String bitSymbol = "฿";

    double input;
    String symbol = "$" ;


    public double toEur(){

         if(symbol == "€"){
            return input;
        }
        else if(symbol == "¥"){
            return  .007 * input;
        }
        else if( symbol == "฿"){
             return 3013.24 * input;
         }
        else{
            return eur * input;
        }

    }


    public double toUsd(){
        if(symbol == "€"){
            return 1.19372 * input;
        }
        else if(symbol == "¥"){
            return 0.00901780 * input;
        }
        else if(symbol == "฿"){
            return 3599.16 * input;
        }
        else{
            return input;
        }
    }

    public double toJpy(){
        if(symbol == "€"){
            return 132.420 * input;
        }
        else if(symbol == "¥"){

            return input;
        }
        else if(symbol == "฿"){
            return 399047.87 * input;
        }
        else{
            return 110.903 * input;
        }
    }

    public double toBit(){
        if(symbol == "€"){
            return 0.00033 * input;
        }
        else if(symbol == "¥"){
            return 0.0000025 * input;
        }
        else if(symbol == "฿"){
            return input;

        }
        else{
            return 0.00027 * input;
        }
    }


    public Money(double input, String symbol) {
        this.input = input;
        this.symbol = symbol;
    }


    public int getUsd() {
        return usd;
    }

    public String getUsdSymbol() {
        return usdSymbol;
    }

    public double getEur() {
        return eur;
    }

    public String getEurSymbol() {
        return eurSymbol;
    }

    public double getJpy() {
        return jpy;
    }

    public String getJpySymbol() {
        return jpySymbol;
    }

    public double getBit() {
        return bit;
    }

    public String getBitSymbol() {
        return bitSymbol;
    }
}
