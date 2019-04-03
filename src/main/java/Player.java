public interface Player {


    League getLeague ();
    Team getTeam ();
    String getName();
    default boolean equals (Player player)  {
        if (this.getLeague()==player.getLeague() && this.getName()==player.getName() && this.getTeam()==player.getTeam())   {
            return true;
        }
        return false;
    }


}
