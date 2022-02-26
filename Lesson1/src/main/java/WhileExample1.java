public class WhileExample1 {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("Stroka #" + count);
            if (count > 3) {
                break;
            }
            count++;
        }
    }
}
//5