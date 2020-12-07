package ikab.dev.views;

import ikab.dev.utils.Console;

public class ResumeView {

    public ResumeView() {

    }

    public boolean isResume() {
        char input;
        do {
            input = Console.getInstance().readChar(Message.RESUME.getMessage());
        } while (!isValidInput(input));
        return 'y' == input;
    }

    private boolean isValidInput(char input) {
        return 'y' == input || 'n' == input;
    }

}
