package Interface;

public class Dog extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Kostj");
    }

    public void run() {
        System.out.println("Sobaka bezhit");

    }
}
