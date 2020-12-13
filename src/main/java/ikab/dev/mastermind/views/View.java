package ikab.dev.mastermind.views;

import ikab.dev.mastermind.models.Game;

public abstract class View {

    private final Game game;

    public View(Game game) {
        this.game = game;
    }


    public void interact() {
        do {
            this.start();
            do {
                this.play();
            } while (!this.isEndGame());
        } while (this.isResume());
    }

    protected abstract void start();

    protected abstract void play();

    protected abstract boolean isEndGame();

    protected abstract boolean isResume();
}
