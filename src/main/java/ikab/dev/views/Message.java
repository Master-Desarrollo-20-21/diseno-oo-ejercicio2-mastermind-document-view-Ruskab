package ikab.dev.views;

enum Message {
    TITLE("----- MASTERMIND -----"),
    ATTEMPTS_COUNT("%s attempt(s):"),
    SECRET_COMBINATION_HIDDEN("xxxx"),
    PROPOSE_COMBINATION("Propose a combination: "),
    PROPOSE_COMBINATION_WRONG_LENGHT("Wrong proposed combination length"),
    PROPOSE_COMBINATION_WRONG_COLORS("Wrong colors, they must be: rbygop"),
    ATTEMPT("%s --> %s blacks and %s whites"),
    WIN_MESSAGE("You've won!!! ;-)"),
    LOST_MESSAGE("You've lost!!! :-("),
    WRONG_PROPOSED_COMBINATION_LENGTH("Wrong proposed combination length"),
    WRONG_PROPOSED_COMBINATION_COLORS("Wrong colors, they must be: rbygop"),
    RESUME("RESUME? (y/n): ");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}