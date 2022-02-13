public class Practice1_1 {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < --j) {
        }
        System.out.println("sevedina promezhutka " + i);
        System.out.println("seredina promezhutka " + j);

        int l = 0;
        while (l <= 100) { // если условик false то не будет
            System.out.println(l++);

        }
        //задача, что выйдет на консоль
        int kk = 0;
        while (true) {
            if (kk > 10) {
                break;
            }
            kk++;
        }
        System.out.print(kk);
    }
}
