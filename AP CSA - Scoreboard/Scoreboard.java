public class Scoreboard {
    private String activeTeam;
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        activeTeam = team1;
    }

    public void recordPlay(int points) {
        if (points > 0) {
            if (activeTeam.equals(team1)) {
                score1 += points;
            } else {
                score2 += points;
            }
        } else {
            if (activeTeam.equals(team1)) {
                activeTeam = team2;
            } else {
                activeTeam = team1;
            }
        }
    }

    public String getScore() {
        return score1 + " - " + score2 + " - " + activeTeam;
    }
}