package EmployeeExample;
import java.util.Random;
public class FullTimeEmp {
    public static void main(String[] args) {
        System.out.println("Welcome to computation program : ");
        Random rd = new Random();
        int Present  = rd.nextInt(2);
        int wagePerHour = 20;
        int fullDayHours = 8;
        int wagePerDay = 0;

        if(Present == 1){
            System.out.println("Employee is present");
            wagePerDay = fullDayHours * wagePerHour;
            System.out.println("Employee's daily wage is:" + wagePerDay);
        }else {
            System.out.println("Employee is absent");
        }

    }

}
