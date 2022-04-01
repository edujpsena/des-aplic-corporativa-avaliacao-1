package br.com.developer;

public class Main {

    public static void main(String[] args) {

        Game basket = new Basket();
        Game soccer = new Soccer();

        basket.play();
        soccer.play();
    }
}
