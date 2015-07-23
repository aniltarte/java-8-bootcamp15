package store;

import stats.Player;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerStore {

    public List<Player> allPlayers() throws Exception{
        URL resource = this.getClass().getClassLoader().getResource("batting.csv");

        return Files.lines(Paths.get(resource.toURI()))
                .skip(1)
                .map(this::createPlayer)
                .collect(Collectors.toList());
    }

    private Player createPlayer(String line) {
        String[] parts = line.split(",");

        return new Player(parts[0],
                parts[1],
                Integer.valueOf(parts[2]),
                Integer.valueOf(parts[3]),
                Integer.valueOf(parts[4]),
                Integer.valueOf(parts[5]),
                Integer.valueOf(parts[6]),
                Double.valueOf(parts[7]),
                Double.valueOf(parts[8]),
                Double.valueOf(parts[9]),
                Integer.valueOf(parts[10]),
                Integer.valueOf(parts[11]),
                Integer.valueOf(parts[12]),
                Integer.valueOf(parts[13]),
                Integer.valueOf(parts[14]));
    }
}
