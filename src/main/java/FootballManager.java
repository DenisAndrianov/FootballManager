import java.util.ArrayList;
import java.util.Arrays;

public class FootballManager {

    FootballManager() {
        addPlayer(new AlexIwobi(),
                new AlissonBecker(),
                new BenGodfrey(),
                new JordanRhodes(),
                new KalvinPhillips(),
                new KemarRoofe(),
                new PetrCech(),
                new RobertoFirmino(),
                new SadioMane(),
                new TimKrul());
    }

    static ArrayList<Player> players = new ArrayList<Player>();

    Player[] getAllPlayers()    {
        return players.toArray(new Player[players.size()]);
    }

    Player[] getTeamPlayers(Team team){
        ArrayList<Player> a = new ArrayList<Player>();
        for (int i = 0; i < players.size(); i++) {
            if (team.equals(players.get(i).getTeam()))  {
                a.add(players.get(i));
            }
        }
        return a.toArray(new Player[0]);
    }

    Player[] getLeaguePlayers(League league) {
        ArrayList<Player> a = new ArrayList<Player>();
        for (int i = 0; i < players.size(); i++) {
            if (league.equals(players.get(i).getLeague()))  {
                a.add(players.get(i));
            }
        }
        return a.toArray(new Player[0]);
    }

    void displayPlayersName (Player[] a)    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i].getName() + "] ");
        }
        System.out.println();
    }

    void addPlayer(Player... player)   {
        players.addAll(Arrays.asList(player));
    }

    void removePlayer (Player player)   {
        for (int i = 0; i < players.size() ; i++) {
            if (players.get(i).equals(player))  {
                players.remove(i);
            }
        }
    }
}
