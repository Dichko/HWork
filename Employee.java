public class Employee {
    private String fN;
    private String position;
    private String email;
    private long phone;
    private double salary;
    private int age;

    public Employee(String fN, String position, String email, long phone, double salary, int age) {
        this.fN = fN;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fN);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary + "тыс.рублей");
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Сидоров Олег Сергеевич", "Монтер пути", "4645@mail.com", 768787887, 37362.43, 45);
        employee1.displayInfo();
    }
}
