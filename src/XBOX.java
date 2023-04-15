import exception.EltortKontroller;
import exception.NemTamogatotJatek;

public class XBOX extends Console{
    private String name;
    public XBOX() {
        this.name = "XBOX One";
    }

    @Override
    public void game(Game game, int skill) throws EltortKontroller, NemTamogatotJatek {
        NemTamogatotJatek e = new NemTamogatotJatek();
        EltortKontroller ex = new EltortKontroller();
        if(game.getSupportedConsole().equalsIgnoreCase("XBOX One")) {
            if((game.getDifficultyLevel()  + 2) > skill) {
                throw ex;
            } else {
                System.out.println("Sikerült végigjátszani");
            }
        } else {
            throw e;
        }
    }
}

/*
 * Megkapja paraméterben a játékot, valamint
a játékos skilljét. Azonban csak azokkal a játékokkal lehet játszani, melyek az adott konzolhoz valóak. Ha
egy játék nem ehhez a konzolhoz való, dobj NemTamogatottJatek típusú kivételt!
* Ellenkező esetben
vizsgáld le, hogy a játékos skillje hogy alakul az aktuális játék nehézségéhez. XBOX esetén “hardcore”
játékosokról van szó, olyan játékot képes végigjátszani melynek nehézsége maximum 2-vel nehezebb, mint
a játékos aktuális skillje. Amennyiben nem tudja végigjátszani a játékot, dobj EltortKontroller típusú
kivételt!

 */
