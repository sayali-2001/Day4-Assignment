package EmployeeExample;

import java.util.Random;

public class PartTimeEmp {
    public static void main(String[] args) {
        Random rd = new Random();
        int Present  = rd.nextInt(2);
        int wagePerHour = 20;
        int pertTimeHours = 4;
        int wagePerDay = 0;

        if(Present == 1){
            System.out.println("Employee is present");
            wagePerDay = pertTimeHours * wagePerHour;
            System.out.println("Employee's daily wage is:" + wagePerDay);
        }else {
            System.out.println("Employee is absent");
        }
    }

}


