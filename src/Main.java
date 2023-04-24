import exception.EltortKontroller;
import exception.NemTamogatotJatek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, EltortKontroller, NemTamogatotJatek {

/*        File file = new File("jatekok.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] split = line.split(";");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
        }

        scanner.close();*/

        Game gta = new Game("Grand Theft Auto V", 1, "XBOX One");
        Game superMario = new Game("Super Márió", 6, "XBOX One");
        Game cs = new Game("Counter Strike", 4, "XBOX One");
        List<Game> games = new ArrayList<>();
        games.add(gta);
        games.add(superMario);
        games.add(cs);
        Jatekos jatekos = new Jatekos(gta, "Csongi",5,"XBOX One", games);

        System.out.println(jatekos.getSkill());
        jatekos.jatszik();
        System.out.println(jatekos.getSkill());
/*        String[] record = null;
        if(file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                record = line.split(";");
                System.out.println(Arrays.toString(record));
            }
        }*/

    }
}