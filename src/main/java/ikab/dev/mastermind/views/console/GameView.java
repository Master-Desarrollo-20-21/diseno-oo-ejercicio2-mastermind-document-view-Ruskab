package ikab.dev.mastermind.views.console;


import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.Message;


public class GameView {

    private Game game;
    private ProposedCombinationView proposedCombinationView;

    public GameView(Game game) {
        this.game = game;
        this.proposedCombinationView = new ProposedCombinationView();
    }

    public void interact() {
        do {
            Console.getInstance().writeln(String.format(Message.ATTEMPTS_COUNT.getMessage(), game.getAttemptsCount()));
            Console.getInstance().writeln(Message.SECRET_COMBINATION_HIDDEN.getMessage());
            for (Attempt attempt : game.getPlayedAttempts()) {
                Console.getInstance()
                        .writeln(String.format(Message.ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getBlacks(), attempt.getWhites()));
            }
            ProposedCombination proposedCombination = proposedCombinationView.readProposedCombination();
            game.playCombination(proposedCombination);
        } while (game.isContinuePlaying());
        if (game.isWinnerGame()) {
            Console.getInstance().writeln(Message.WIN_MESSAGE.getMessage());
        } else {
            Console.getInstance().writeln(Message.LOST_MESSAGE.getMessage());
        }
    }

    public boolean isEndGame() {
        return !game.isContinuePlaying();
    }
}
