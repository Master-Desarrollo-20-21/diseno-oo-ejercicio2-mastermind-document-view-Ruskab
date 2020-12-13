package ikab.dev.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final SecretCombination secretCombination;
    private Attempt currentAttempt;
    private final List<Attempt> playedAttempts;

    public Game() {
        playedAttempts = new ArrayList<>();
        secretCombination = new SecretCombination();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        currentAttempt = new Attempt(proposedCombination, secretCombination);
        playedAttempts.add(currentAttempt);
    }

    public boolean isContinuePlaying() {
        return playedAttempts.size() < 10 && !currentAttempt.isWinnerAttempt();
    }

    public boolean isWinnerGame() {
        return currentAttempt.isWinnerAttempt();
    }

    public int getAttemptsCount() {
        return playedAttempts.size();
    }

    public List<Attempt> getPlayedAttempts() {
        return playedAttempts;
    }
}
