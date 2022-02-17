package Interface;

public class Bird extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Korm dlja ptits");
    }

    @Override
    public void run() {
        System.out.println("Ptica bezhit");
    }
}
