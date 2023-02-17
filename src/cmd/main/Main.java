package cmd.main;

import internal.transport.Automobile;

public class Main {
    public static void main(String[] args) {
        Automobile bmw = new Automobile("black", 157.97f, 1500, "bmw", 2015);
        System.out.println(bmw.get.view());
    }
}