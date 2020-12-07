package ikab.dev.views;


import ikab.dev.models.Attempt;
import ikab.dev.models.Game;
import ikab.dev.models.ProposedCombination;
import ikab.dev.utils.Console;


public class GameView {

    private Game game;
    private ProposedCombinationView proposedCombinationView;

    public GameView(Game game) {
        this.game = game;
        this.proposedCombinationView = new ProposedCombinationView();
    }

    void interact() {
        do {
            Console.getInstance().writeln(String.format(Message.ATTEMPTS_COUNT.getMessage(), game.getAttemptsCount()));
            Console.getInstance().writeln(Message.SECRET_COMBINATION_HIDDEN.getMessage());
            for (Attempt attempt : game.getProposedAttempts()) {
                Console.getInstance().writeln(String.format(Message.ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getBlacks(), attempt.getWhites()));
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
        return game.isContinuePlaying();
    }
}
