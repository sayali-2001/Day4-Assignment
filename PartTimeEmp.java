package EmployeeExample;

import java.util.Random;

public class PartTimeEmp {
    public static void main(String[] args) {
        int Full_Time = 1;
        int Part_Time = 2;

        double random = Math.floor(Math.random() * 10) %3;

        int wagePerHour = 20;
        int empWorkingHrs =0 ;

        int empWage;

        if (random == Part_Time) {
            System.out.println("Employee is present for Part Time");
            empWorkingHrs = 4;
        } else {
            System.out.println("Employee is absent");
        }

        empWage = empWorkingHrs * wagePerHour;
        System.out.println("Employee's daily wage is: " + empWage);

    }

}


