package stats;

public class Player {
    public final String name;
    public final String country;
    public final Integer matches;
    public final Integer innings;
    public final Integer notOuts;
    public final Integer runs;
    public final Integer highScore;
    public final Double average;
    public final Double bestFor;
    public final Double strikeRate;
    public final Integer centuries;
    public final Integer fifties;
    public final Integer ducks;
    public final Integer fours;
    public final Integer sixes;

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
}
