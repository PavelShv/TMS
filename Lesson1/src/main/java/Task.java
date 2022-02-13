public class Task {
    public static void main(String[] args) {
        int count = 0;
        for (String value : args) {
            int parseIntValue = Integer.parseInt(value);
            if (parseIntValue > 0) {
                count = count + 1;
            }
        }
        System.out.println("kolichestvo polozhitelnyh chisel - " + count);
    }
}
