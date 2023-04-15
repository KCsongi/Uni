import exception.EltortKontroller;
import exception.NemTamogatotJatek;

public abstract class Console {
    private Game game;

    public Console(Game game) {
        this.game = game;
    }

    public Console() {

    }

    public abstract void game(Game game, int skill) throws EltortKontroller, NemTamogatotJatek;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
