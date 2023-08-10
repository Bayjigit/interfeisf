public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("Balbay");
        Shark shark1 = new Shark("Dalbinio");
        Shark shark2 = new Shark("Asdf");
        Shark shark3 = new Shark("Bobur");
        Shark shark4 =  new Shark("Marselo");
        Shark[] sharks = {shark,shark1,shark2,shark3,shark4};

        Duck duck = new Duck("Asdf");
        Duck duck1 = new Duck("Bobur");
        Duck duck2 = new Duck("Asdf");
        Duck duck3 =  new Duck("Bobur");
        Duck duck4 = new Duck("BObur");
        Duck[] ducks = {duck,duck1,duck2,duck3,duck4};

        Turtle turtle = new Turtle("Bobur");
        Turtle turtle1 = new Turtle("ASdf");
        Turtle turtle2 = new Turtle("Bobur");
        Turtle turtle3 = new Turtle("MArselo");
        Turtle turtle4 = new Turtle("Nursultan");
        Turtle[] turtles = {turtle,turtle1,turtle2,turtle3,turtle4};

        Ocean ocean = new Ocean();
        ocean.setSharks(sharks);
        ocean.setDucks(ducks);
        ocean.setTurtles(turtles);
        System.out.println(ocean);
    }
}