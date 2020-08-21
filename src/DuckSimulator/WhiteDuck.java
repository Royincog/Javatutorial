package DuckSimulator;

public class WhiteDuck extends Duck {
    public WhiteDuck(){
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I am white duck");
    }

}
