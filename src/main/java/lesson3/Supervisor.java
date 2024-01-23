package lesson3;

import java.util.ArrayList;

public class Supervisor extends Employee{
    public Supervisor(String fio, String position, int phone, int salary, int age) {
        super(fio, position, phone, salary, age);
    }

    public Supervisor(int salary, int age) {
        super(salary, age);
    }

    /**
     * Руководитель повышает зп всем, кроме руководителей
     * @param employees список сотрудников
     * @param age возраст повышения
     * @param increase величина повышения
     */
    public static void changeSalary(ArrayList<Employee> employees, int age, int increase){
        for (Employee item: employees){
            if (item instanceof Supervisor) continue;
            if(item.getAge() > age){
                item.setSalary(item.getSalary()+increase);
            }
        }
    }
}
