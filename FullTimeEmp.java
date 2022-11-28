package EmployeeExample;
import java.util.Random;
public class FullTimeEmp {
    public static void main(String[] args) {

        double random = Math.floor(Math.random() * 10) %2;
        int wagePerHour = 20;
        int empWorkingHrs = 8;
        int totalEarning = 0;
        int isPresent = 1;

        if(random == isPresent){
            System.out.println("Employee is present");
            totalEarning = empWorkingHrs * wagePerHour;
            System.out.println("Employee's daily wage is:" + totalEarning);
        }else {
            System.out.println("Employee is absent");
        }

    }

}
