package popquiz;

public class Mallard extends Duck implements Quackable{
    private int flySpeed;

    public Mallard(String name, int age) {
        super(name, age);
        flySpeed = 20;
    }


    public void getMallordDetails(){
        System.out.println("My name is " + getName() + " my age is " + getAge() + " and my flight speed is " + getFlySpeed());
    }

    public int getFlySpeed(){
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public void quack() {
        System.out.println("bork, bork");
    }
}
