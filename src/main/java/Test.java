
public class Test {


    public static void main (String[] args) {
        FootballManager manager = new FootballManager();
        manager.displayPlayersName(manager.getLeaguePlayers(League.LeagueOne));
        System.out.println("-----------------");
        manager.displayPlayersName(manager.getLeaguePlayers(League.Championship));
        System.out.println("-----------------");
        manager.displayPlayersName(manager.getAllPlayers());
        System.out.println("-----------------");
        manager.displayPlayersName(manager.getTeamPlayers(Team.Leeds));
        System.out.println("-----------------");
        manager.removePlayer(new KemarRoofe());
        manager.displayPlayersName(manager.getTeamPlayers(Team.Leeds));
        System.out.println("-----------------");

    }
}
