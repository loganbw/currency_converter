package com.logan;

public class Main {

    public static void euro(){
        Money money = new Money(1, "$");
        double amount = money.toEur();
        System.out.println(money.getEurSymbol() + amount);
    }
    public static void jpy(){
        Money money = new Money(1, "$");
        double amount = money.toJpy();
        System.out.println(money.getJpySymbol() + amount);
    }
    public static void usd(){
        Money money = new Money(1, "$");
        double amount = money.toUsd();
        System.out.println(money.getUsdSymbol() + amount);
    }
    public static void bit(){
        Money money = new Money(1, "$");
        double amount = money.toBit();
        System.out.println(money.getBitSymbol() + amount);
    }
    public static void main(String[] args) {
        euro();
        jpy();
        usd();
        bit();


    }
//    Create a Money class that can store it's own amount and currency symbol.
//    Provide methods to convert between whatever currency is provided to USD, JPY, EUR, BTC.
//    Implement the conversion rates for USD, JPY, EUR, and BTC.

}
