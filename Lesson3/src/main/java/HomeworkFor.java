public class HomeworkFor {
    public static void main(String[] args) {
        char c = 'a';
        char m = 12;
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " ");
        }
        printEnglishLetters('A');
    }

    private static char printEnglishLetters(char value) {
        System.out.println(value + " ");
        if (value == 'Z') {
            return 0;
        }
        return printEnglishLetters(++value);
    }
}
