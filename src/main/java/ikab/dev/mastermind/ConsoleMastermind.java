package ikab.dev.mastermind;


import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.views.ConsoleView;

class ConsoleMastermind extends Mastermind {

	@Override
	protected ConsoleView createView(Game game) {
		return new ConsoleView(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}