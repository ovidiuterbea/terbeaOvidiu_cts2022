package main;

import template.MijlocTransportPeSine;
import template.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        System.out.println();
        tramvai.parcurgereTraseuInvers();
    }
}