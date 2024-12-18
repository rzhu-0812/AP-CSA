public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public Game(Level lvlOne, Level lvltwo, Level lvlThree, boolean bonus) {
        levelOne = lvlOne;
        levelTwo = lvltwo;
        levelThree = lvlThree;
        this.bonus = bonus;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void play() {
        levelOne = new Level((int) (Math.random() * (20) + 1), true);
        levelTwo = new Level((int) (Math.random() * (20) + 1), true);
        levelThree = new Level((int) (Math.random() * (20) + 1), true);
    }

    public int getScore() {
        int totalScore = 0;

        if (levelOne.goalReached()) {
            totalScore += levelOne.getPoints();

            if (levelTwo.goalReached()) {
                totalScore += levelTwo.getPoints();

                if (levelThree.goalReached()) {
                    totalScore += levelThree.getPoints();
                }
            }
        }

        if (isBonus()) totalScore *= 3;

        return totalScore;
    }

    public int playManyGames(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > highestScore) highestScore = score;
        }
 
        return highestScore;
    }
}