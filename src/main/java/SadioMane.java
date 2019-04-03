public class SadioMane implements Player {
    Team team = Team.Liverpool;
    League league = team.league;
    String name = "Sadio Mane";


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
