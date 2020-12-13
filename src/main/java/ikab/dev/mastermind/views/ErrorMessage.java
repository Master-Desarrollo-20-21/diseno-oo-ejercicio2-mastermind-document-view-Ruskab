package ikab.dev.mastermind.views;

public enum ErrorMessage {
    WRONG_PROPOSED_COMBINATION_LENGTH("Wrong proposed combination length"),
    WRONG_PROPOSED_COMBINATION_COLORS("Wrong colors, they must be: rbygop"),
    DUPLICATE_PROPOSED_COMBINATION_COLORS("Duplicate colors");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}