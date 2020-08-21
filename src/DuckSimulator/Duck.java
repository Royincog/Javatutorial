package DuckSimulator;

public abstract class Duck{
    FlyBehavior flyBehavior;
    abstract void display();
    public void performfly(){
        flyBehavior.fly();
    }

}
