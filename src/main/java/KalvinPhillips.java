public class KalvinPhillips implements Player {
    Team team = Team.Leeds;
    League league = team.league;
    String name = "Kalvin Phillips";


    @Override
    public League getLeague() {
        return league;
    }

    @Override
    public Team getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }
}