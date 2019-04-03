class AlissonBecker implements Player {
    Team team = Team.Liverpool;
    League league = team.league;
    String name = "Alisson Becker";


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
