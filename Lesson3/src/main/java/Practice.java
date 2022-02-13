public class Practice {
    String str;
    int value;

    public static void main(String[] args) {
        boolean b[] = new boolean[3];
        b[0] = true;
        b[1] = true;
        b[2] = false;

        int[] kk = {};
        System.out.println(kk.length);

        String dyt = null;
        int[] nn = new int[5];

        int[] mass = new int[5];
        mass[2] = 10;
        mass[4] = 11;

        System.out.println();

        int length = mass.length;
        int element = mass[--length];
        System.out.println(element);
        System.out.println(mass[--length]);
    }
}
