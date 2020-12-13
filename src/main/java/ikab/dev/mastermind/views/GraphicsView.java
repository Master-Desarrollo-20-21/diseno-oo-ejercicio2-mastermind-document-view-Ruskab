package ikab.dev.mastermind.views;

import ikab.dev.mastermind.models.Game;

public class GraphicsView extends View {

    public GraphicsView(Game game) {
        super(game);
    }

    @Override
    protected void start() {

    }

    @Override
    protected void play() {

    }

    @Override
    protected boolean isEndGame() {
        return false;
    }

    @Override
    protected boolean isResume() {
        return false;
    }
}
