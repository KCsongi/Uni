import exception.EltortKontroller;
import exception.NemTamogatotJatek;

public class Nintendo extends Console {
    private String name;

    public Nintendo() {
        super();
        this.name = "Nintendo Wii";
    }


    @Override
    public void game(Game game, int skill) throws EltortKontroller, NemTamogatotJatek {
        NemTamogatotJatek e = new NemTamogatotJatek();
        EltortKontroller ex = new EltortKontroller();
        if (game.getSupportedConsole().equalsIgnoreCase("Nintendo Wii")) {
            if (game.getDifficultyLevel() > skill) {
                System.out.println("Ez a játék túl nehéz neked. Eltörted a konrollered! " + ex);
            } else {
                System.out.println("Sikerült végigjátszani");
            }
        } else {
            System.out.println("Ezzel sajnos nem tudsz játszani! " + e);
        }
    }
}

/*
Nintendo esetében alkalmi játékosokról van szó. A játszik metódus az XBOX-hoz hasonlóan működjön,
azonban a játékos csak olyan játékokat tud végigjátszani, melyek nehézségi szintje maximum a játékos
skilljével egyezik meg.
 */
