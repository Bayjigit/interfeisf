public class Turtle implements SwimAble{
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Turtle swimming");
    }

    @Override
    public String toString() {
        return "Turtle:" +"\n"+
                "name:" + name + "\n";
    }
}