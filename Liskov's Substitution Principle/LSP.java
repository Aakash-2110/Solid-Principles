abstract class Bird
{
    abstract void makesound();
}
interface Flyingbird
{
    public void fly();
}
class Penguin extends Bird
{
    public void makesound()
    {
        System.out.println("braying braying");
    }
}
class Sparrow extends Bird implements Flyingbird
{
    public void makesound()
    {
        System.out.println("chirp chirp");
    }
    public void fly()
    {
        System.out.println("Sparrow can fly");
    }
}
public class LSP {
    public static void main(String[] args) {
        Penguin pg = new Penguin();
        Sparrow sp = new Sparrow();
        pg.makesound();
        sp.makesound();
        Flyingbird fb = new Sparrow();
        fb.fly();
    }   
}
