public class AlexIwobi implements Player{
    Team team = Team.Arsenal;
    League league = team.league;
    String name = "Alex Iwobi";


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
