import exception.EltortKontroller;
import exception.NemTamogatotJatek;

import java.util.List;

public class Jatekos extends Console{
    private String name;
    private int skill;
    private List<Console> consoles;
    private List<Game> games;

    public Jatekos(Game game, String name, int skill, List<Console> consoles, List<Game> games) {
        super(game);
        this.name = name;
        if(skill < 0 ) {
            this.skill = 0;
        } else if (skill > 10) {
            this.skill = 10;
        } else {
            this.skill = skill;
        }
        this.consoles = consoles;
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void jatszik(int skill) throws EltortKontroller, NemTamogatotJatek {
        for(Game game : games) {
            game(game, this.skill);
            if(this.skill > skill) {
                this.skill++;
            } else {
                System.out.println(this.name + "nevezetű játékos nem tudta végigjátszani " + game.getName() + " nevezetű játékot");
            }
        }
    }

    @Override
    public void game(Game game, int skill) throws EltortKontroller, NemTamogatotJatek {

    }

/*    public Console getKonzol() {
        return consoles;
    }

    public void setKonzol(Console konzol) {
        this.consoles = konzol;
    }

    public Game getGame() {
        for(Game game : games){
            return game;
        }
        return null;
    }

    public void setGame(Game game) {
        consoles.add(game);
    }*/
}
