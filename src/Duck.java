public class Duck implements SwimAble{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public String toString() {
        return "Duck:" +"\n"+
                "name:" + name + "\n";
    }
}
