class RobertoFirmino implements Player {
    Team team = Team.Liverpool;
    League league = team.league;
    String name = "Roberto Firmino";

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