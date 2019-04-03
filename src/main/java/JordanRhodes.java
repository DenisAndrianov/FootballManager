public class JordanRhodes implements Player {
    Team team = Team.Norwich;
    League league = team.league;
    String name = "Jordan Rhodes";


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
