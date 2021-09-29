package practice;

public class Dog extends Animal{
    public void digHole(){
        System.out.println("Dug a Hole!!!!");
    }
    public Dog(){
        super();

        setSound("Bark");
    }
}
