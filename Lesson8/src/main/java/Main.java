public class Main {
    public static void main(String[] args) {
        Employee empl = new Employee("Tom", "Simpson", "Oracle");
        empl.displayInfo();
        String firstName = empl.getName();
        System.out.println(firstName);
    }
}
