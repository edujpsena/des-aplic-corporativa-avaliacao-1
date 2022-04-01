package br.com.developer;

public class Basket extends Game{

    @Override
    public void buildTeam() {
        System.out.println("5 jogadores para cada lado");
    }

    @Override
    public void initialize() {
        System.out.println("Joga bola para cima");
    }

    @Override
    public void stardGame() {
        System.out.println("Quem pegar a bola começa a partida");
    }

    @Override
    public void endGame() {
        System.out.println("Jogo finalizado");
    }

}
