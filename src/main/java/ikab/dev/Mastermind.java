package ikab.dev;


import ikab.dev.models.Game;
import ikab.dev.views.View;

public class Mastermind {

    private final Game game;
    private final View view;

    private Mastermind() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    private void play() {
        this.view.interact();
    }
}

