public class Game {
    private String name;
    private int difficultyLevel;
    private String supportedConsole;

    public Game(String name, int difficultyLevel, String supportedConsole) {
        this.name = name;
        if (difficultyLevel < 0) {
            this.difficultyLevel = 0;
        } else if (difficultyLevel > 10) {
            this.difficultyLevel = 10;
        } else {
            this.difficultyLevel = difficultyLevel;
        }
        this.supportedConsole = supportedConsole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getSupportedConsole() {
        return supportedConsole;
    }

    public void setSupportedConsole(String supportedConsole) {
        this.supportedConsole = supportedConsole;
    }
}
