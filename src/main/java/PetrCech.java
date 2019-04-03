public class PetrCech implements Player {
    Team team = Team.Arsenal;
    League league = team.league;
    String name = "Petr Cech";


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
