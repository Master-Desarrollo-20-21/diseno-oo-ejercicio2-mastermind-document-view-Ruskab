package ikab.dev.mastermind.views;

import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.console.GameView;
import ikab.dev.mastermind.views.console.ResumeView;

import static ikab.dev.mastermind.views.Message.TITLE;

public class ConsoleView extends View {

    private final GameView gameView;
    private final ResumeView resumeView;

    public ConsoleView(Game game) {
        super(game);
        this.resumeView = new ResumeView();
        this.gameView = new GameView(game);
    }

    @Override
    protected void start() {
        Console.getInstance().write(TITLE.getMessage());
    }

    @Override
    protected void play() {
        gameView.interact();
    }

    @Override
    protected boolean isEndGame() {
        return gameView.isEndGame();
    }

    @Override
    protected boolean isResume() {
        return resumeView.isResume();
    }
}
