package br.com.developer;

public class Soccer extends Game{

    @Override
    public void buildTeam() {
        System.out.println("11 jogadores para cada lado");
    }

    @Override
    public void initialize() {
        System.out.println("Cara ou coroa");
    }

    @Override
    public void stardGame() {
        System.out.println("Quem ganhar no cara ou coroa começa a partida, quem perde escolhe o lado");
    }

    @Override
    public void endGame() {
        System.out.println("Jogo finalizado");
    }

}
