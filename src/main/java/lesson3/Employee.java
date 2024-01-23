package lesson3;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
    private String fio;
    private String position;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int salary, int age) {
        this.fio = "default";
        this.position = "default";
        this.phone = 100;
        this.salary = salary;
        this.age = age;
    }

    public static void changeSalary(ArrayList<Employee> employees, int age, int increase){
        for (Employee item: employees){
            if(item.getAge() > age){
                item.setSalary(item.getSalary()+increase);
            }
        }
    }

    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2){
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);
        long days = Duration.between(date1.atStartOfDay(), date2.atStartOfDay()).toDays();
        return (int) Math.signum(days);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public void info(){
        System.out.println(this.toString());
    }
    public void info_format(){
        System.out.println(String.format("%s", this));
    }
}