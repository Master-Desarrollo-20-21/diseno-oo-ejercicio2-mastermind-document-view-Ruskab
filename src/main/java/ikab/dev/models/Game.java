package ikab.dev.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final SecretCombination secretCombination;
    private Attempt currentAttempt;
    private List<Attempt> proposedAttempts;

    public Game() {
        proposedAttempts = new ArrayList<>();
        secretCombination = new SecretCombination();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        currentAttempt = new Attempt(proposedCombination, secretCombination);
        proposedAttempts.add(currentAttempt);
    }

    public boolean isContinuePlaying() {
        return proposedAttempts.size() < 10 && !currentAttempt.isWinnerAttempt();
    }

    public boolean isWinnerGame() {
        return currentAttempt.isWinnerAttempt();
    }

    public int getAttemptsCount() {
        return proposedAttempts.size();
    }

    public List<Attempt> getProposedAttempts() {
        return proposedAttempts;
    }
}
