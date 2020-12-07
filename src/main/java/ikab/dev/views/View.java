package ikab.dev.views;

import ikab.dev.models.Game;
import ikab.dev.utils.Console;

import static ikab.dev.views.Message.TITLE;

public class View {

    private final Game game;
    private final GameView gameView;
    private final ResumeView resumeView;

    public View(Game game) {
        this.game = game;
        this.resumeView = new ResumeView();
        this.gameView = new GameView(game);
    }


    public void interact() {
        do {
            Console.getInstance().write(TITLE.getMessage());
            do {
                gameView.interact();
            } while (gameView.isEndGame());
        } while (resumeView.isResume());
    }
}
