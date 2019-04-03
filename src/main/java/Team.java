public enum Team {

    Liverpool(League.PremierLeague),
    Arsenal(League.PremierLeague),
    Norwich(League.Championship),
    Leeds(League.Championship);


    League league;
    Team (League league)    {
        this.league = league;
    }
}
