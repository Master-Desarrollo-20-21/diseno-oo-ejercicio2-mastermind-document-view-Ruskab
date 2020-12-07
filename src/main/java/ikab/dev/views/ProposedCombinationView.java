package ikab.dev.views;

import ikab.dev.models.Color;
import ikab.dev.models.ProposedCombination;
import ikab.dev.utils.Console;

import static ikab.dev.views.Message.PROPOSE_COMBINATION;

public class ProposedCombinationView {

    public ProposedCombinationView() {

    }

    ProposedCombination readProposedCombination() {
        String proposedCombinationCode = "";
        do {
            proposedCombinationCode = Console.getInstance().readString(PROPOSE_COMBINATION.getMessage());
            Console.getInstance().writeln();
            Console.getInstance().writeln();
        } while (!isValidProposedCombination(proposedCombinationCode));
        return new ProposedCombination(proposedCombinationCode.toCharArray());
    }

    private boolean isValidProposedCombination(String proposedCombinationCode) {
        if (proposedCombinationCode.isBlank()) {
            return false;
        }
        if (proposedCombinationCode.length() != ProposedCombination.COMBINATION_SIZE) {
            Console.getInstance().writeln(Message.WRONG_PROPOSED_COMBINATION_LENGTH.getMessage());
        }
        if (!isValidColors(proposedCombinationCode)) {
            Console.getInstance().writeln(Message.WRONG_PROPOSED_COMBINATION_COLORS.getMessage());
        }
        return true;
    }

    private boolean isValidColors(String proposedCombination) {
        for (char colorCode : proposedCombination.toCharArray()) {
            if (!Color.isValidColor(colorCode)) {
                return false;
            }
        }
        return true;
    }
}
