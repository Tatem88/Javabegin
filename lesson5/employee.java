package lesson5;

public class employee {  // Создание класса "Сотрудник" с полями: ФИ, должность, email, телефон, зарплата, возраст
    private String fi;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    //Конструктор класса, заполняющий поля при создании объекта
    public employee(String fi, String pos, String email, String phone, long sal, int age) {
        this.fi = fi;
        this.position = pos;
        this.email = email;
        this.phone = phone;
        this.salary = sal;
        this.age = age;
    }
    // Метод, выводящий информацию об объекте в консоль
    public void printInfo() {
        System.out.println("Employee:");
        System.out.println("Full name: " + this.fi);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }

    // задания 4, 5 в классе Human

    public String getFi() {
        return fi;
    }

    public void setFio(String fi) {
        this.fi = fi;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

