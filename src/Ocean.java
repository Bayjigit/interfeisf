import java.util.Arrays;

public class Ocean {
    private Shark[] sharks;
    private Duck[] ducks;
    private Turtle[] turtles;

    public Ocean() {
    }

    public Ocean(Shark[] sharks, Duck[] ducks, Turtle[] turtles) {
        this.sharks = sharks;
        this.ducks = ducks;
        this.turtles = turtles;
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    @Override
    public String toString() {
        return "Ocean:" +"\n"+
                "sharks:" + Arrays.toString(sharks) +
                "ducks:" + Arrays.toString(ducks) +
                "turtles:" + Arrays.toString(turtles);
    }
}