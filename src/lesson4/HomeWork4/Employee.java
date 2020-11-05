package lesson4.HomeWork4;

public class Employee {
    String surname;
    private String name;
    String middleName;
    String position;
    int telephone;
    private int salary;
    private int age;

    public Employee(String surname,
                    String name,
                    String middleName,
                    String position,
                    int telephone,
                    int salary,
                    int age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void infoEmployee() {
        System.out.println("ФИО: " + surname
                + " " + name + " " + middleName + "\n"
                + "Должность: " + position + "\n"
                + "Телефон: " + telephone + "\n"
                + "Зарплата: " + salary + "р.\n"
                + "Возраст: " + age + " лет.");
    }

    void outSNM(){
        System.out.println("ФИО: " + surname
                + " " + name + " " + middleName );
    }

    void outPosition(){
        System.out.println("Должность: " + position );
    }

    void outTelephone(){
        System.out.println("Телефон: " + telephone );
    }

    void outSalsry(){
        System.out.println("Зарплата: " + salary + "р.");
    }

    void outAge(){
        System.out.println("Возраст: " + age + " лет.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void raiseSalary(int n, int a){
        if(age > a) salary += n;
    }

}