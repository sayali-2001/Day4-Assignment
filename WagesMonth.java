package EmployeeExample;

import java.util.Random;

public class WagesMonth {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int wagePerDay = 0;
        int totalSalary = 0;
        int day = 1;
        int Working_Days = 20;


        for (day = 1; day <= Working_Days; day++) {
            int Working_Hour = 0;
            Random random = new Random();
            int attendance = random.nextInt(3);
            System.out.println("Attendence is : "+attendance);
            switch (attendance) {
                case 1:
                    //Full time
                    Working_Hour = 8;
                    break;
                case 2:
                    //Part Time
                    Working_Hour =4;
                    break;
                default:
                    System.out.println("Employee is absent");

            }
            int wage = Working_Hour * wagePerHour;
            System.out.println("Day " + day + " wage is:" + wage);
            totalSalary = totalSalary + wage ;

        }
        System.out.println("Total wage for a month is " + totalSalary);
    }
    }
