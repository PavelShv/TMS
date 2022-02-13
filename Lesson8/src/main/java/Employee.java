class Employee extends Person {
    private String company;

    public Employee(String name, String surename, String company) {
        super(name, surename);
        this.company = company;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kompania: " + company);
    }
}

