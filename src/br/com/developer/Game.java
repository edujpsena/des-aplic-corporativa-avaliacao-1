package br.com.developer;

public abstract class Game {

    public abstract void buildTeam();
    public abstract void initialize();
    public abstract void stardGame();
    public abstract void endGame();

    public void play() {
        this.buildTeam();
        this.initialize();
        this.stardGame();
        this.endGame();
    }
}
