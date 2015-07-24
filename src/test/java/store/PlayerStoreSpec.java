package store;

import org.junit.Test;

import java.util.List;

public class PlayerStoreSpec {

    @Test
    public void itPrintsAllPlayers() throws Exception{
        List<Player> players = new PlayerStore().allPlayers();
        players.stream().forEach(p -> System.out.println(p.getName()));
    }
}
