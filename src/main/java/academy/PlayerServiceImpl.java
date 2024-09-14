package academy;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService {
    private List<Player> players;

    public PlayerServiceImpl() {
        this.players = new ArrayList<>();
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }
}
