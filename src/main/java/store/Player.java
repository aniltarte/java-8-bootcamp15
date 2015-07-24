package store;

public class Player {
    private final String name;
    private final String country;
    private final Integer matches;
    private final Integer innings;
    private final Integer notOuts;
    private final Integer runs;
    private final Integer highScore;
    private final Double average;
    private final Double bestFor;
    private final Double strikeRate;
    private final Integer centuries;
    private final Integer fifties;
    private final Integer ducks;
    private final Integer fours;
    private final Integer sixes;

    public Player(
            String name, String country, Integer matches, Integer innings, Integer notOuts, Integer runs,
            Integer highScore, Double average, Double bestFor, Double strikeRate, Integer centuries,
            Integer fifties, Integer ducks, Integer fours, Integer sixes) {

        this.name = name;
        this.country = country;
        this.matches = matches;
        this.innings = innings;
        this.notOuts = notOuts;
        this.runs = runs;
        this.highScore = highScore;
        this.average = average;
        this.bestFor = bestFor;
        this.strikeRate = strikeRate;
        this.centuries = centuries;
        this.fifties = fifties;
        this.ducks = ducks;
        this.fours = fours;
        this.sixes = sixes;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getMatches() {
        return matches;
    }

    public Integer getInnings() {
        return innings;
    }

    public Integer getNotOuts() {
        return notOuts;
    }

    public Integer getRuns() {
        return runs;
    }

    public Integer getHighScore() {
        return highScore;
    }

    public Double getAverage() {
        return average;
    }

    public Double getBestFor() {
        return bestFor;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public Integer getCenturies() {
        return centuries;
    }

    public Integer getFifties() {
        return fifties;
    }

    public Integer getDucks() {
        return ducks;
    }

    public Integer getFours() {
        return fours;
    }

    public Integer getSixes() {
        return sixes;
    }
}
