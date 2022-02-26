public class WhileExample {
    public static void main(String[] args) {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("Do starta: " + countDown);
            countDown--;
        }
        System.out.println("Poehali!");
    }
}