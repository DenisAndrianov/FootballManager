public class KemarRoofe implements Player {
    Team team = Team.Leeds;
    League league = team.league;
    String name = "Kemar Roofe";


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