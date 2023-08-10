public class Shark implements SwimAble{
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    @Override
    public String toString() {
        return "Shark:" +"\n"+
                "name:" + name+"\n";
    }
}