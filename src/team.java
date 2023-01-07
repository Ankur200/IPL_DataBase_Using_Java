public class team extends tournament{
    private String teamName;
    private String ceoName;
    private String coach;
    private String homeStadium;

    private int totalPlayer = 0;
    player p[] = new player[20];
    public team(){}

    public team(String teamName, String ceoName, String coach, String homeStadium) {
        this.teamName = teamName;
        this.ceoName = ceoName;
        this.coach = coach;
        this.homeStadium = homeStadium;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getHomeStadium() {
        return homeStadium;
    }

    public void setHomeStadium(String homeStadium) {
        this.homeStadium = homeStadium;
    }

    public int getTotalPlayer() {
        return totalPlayer;
    }

    public void addPlayer(player dummy){
        if(totalPlayer==20){
            System.out.println("Team Players full");
            return;
        }
        p[totalPlayer]=dummy;
        totalPlayer++;
    }

    @Override
    public String toString() {
        return "Team Name = " + teamName + "\n" +
                "Owner Name = " + ceoName + "\n" +
                "Coach = " + coach + "\n" +
                "Home Stadium = " + homeStadium + "\n"+
                "Total Player = " + totalPlayer;
    }
}