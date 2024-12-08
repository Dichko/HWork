class Person {
    private String fN;
    private String position;
    private String email;
    private long phoneNumber;
    private double salary;
    private int age;

    public Person(String name, String position, String email, long phoneNumber, double salary, int age) {
        this.fN = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + fN);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Sidorov Sergey", "Track fitter", "4645@mail.com", 768787887, 37362.43, 45);
        persArray[1] = new Person("Balabanov Artyom ", "Electromechanic", "arti2323.@gmail.com", 801234567L, 5000, 30);
        persArray[2] = new Person("Peskov Pavel ", "Engineer", "pavel.pes.@gmail.com", 803456789L, 7000, 28);
        persArray[3] = new Person("Leshkova Elena ", "Economist", "elena25@gmail.com", 804567890L, 6000, 25);
        persArray[4] = new Person("Rynco Vladimir ", "Analyst", "run.vov@gmail.com", 805678901L, 5500, 40);
        for (Person person : persArray) {
            person.printInfo();
        }
    }
}

