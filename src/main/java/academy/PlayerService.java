package academy;

import java.util.List;

public interface PlayerService {
        void addPlayer(Player player);
        void removePlayer(Player player);
        Player getPlayerById(int id);
        List<Player> getAllPlayers();
    }


