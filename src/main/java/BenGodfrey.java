public class BenGodfrey implements Player {
    Team team = Team.Norwich;
    League league = team.league;
    String name = "Ben Godfrey";


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
