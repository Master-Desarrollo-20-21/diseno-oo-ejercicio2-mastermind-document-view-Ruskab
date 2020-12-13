package ikab.dev.mastermind;


import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.views.GraphicsView;

public class GraphicsMastermind extends Mastermind {
	
	@Override
	protected GraphicsView createView(Game game) {
		return new GraphicsView(game);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}