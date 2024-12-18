public class Main {
    public static void main(String[] args) {
        Level lvlOneGameOne = new Level(200, true);
        Level lvlTwoGameOne = new Level(100, true);
        Level lvlThreeGameOne = new Level(500, true);
        Game gameOne = new Game(lvlOneGameOne, lvlTwoGameOne, lvlThreeGameOne, true);
        System.out.println(gameOne.getScore());

        Level lvlOneGameTwo = new Level(200, true);
        Level lvlTwoGameTwo = new Level(100, true);
        Level lvlThreeGameTwo = new Level(500, false);
        Game gameTwo = new Game(lvlOneGameTwo, lvlTwoGameTwo, lvlThreeGameTwo, false);
        System.out.println(gameTwo.getScore());

        Level lvlOneGameThree = new Level(200, true);
        Level lvlTwoGameThree = new Level(100, false);
        Level lvlThreeGameThree = new Level(500, true);
        Game gameThree = new Game(lvlOneGameThree, lvlTwoGameThree, lvlThreeGameThree, true);
        System.out.println(gameThree.getScore());

        Level lvlOneGameFour = new Level(200, false);
        Level lvlTwoGameFour = new Level(100, true);
        Level lvlThreeGameFour = new Level(500, true);
        Game gameFour = new Game(lvlOneGameFour, lvlTwoGameFour, lvlThreeGameFour, false);
        System.out.println(gameFour.getScore());

        Game gameFive = new Game(null, null, null, false);
        System.out.println(gameFive.playManyGames(10));
    }
}
