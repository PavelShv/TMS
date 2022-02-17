package Interface;

public class Cat extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Ryba");
    }

    public void run() {
        System.out.println("Kot bezhit");
    }
}
