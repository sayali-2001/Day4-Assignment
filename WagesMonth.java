package EmployeeExample;

import java.util.Random;

public class WagesMonth {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int totalEmpWage = 0;
        int day ;
        int totalWorkingDays = 20;

        for (day = 1; day <= totalWorkingDays; day++) {
            int empWorkingHour = 0;

            double random = Math.floor(Math.random() * 10) %3;

            switch ((int) random) {
                case 1:
                    //Full time
                    empWorkingHour = 8;
                    break;
                case 2:
                    //Part Time
                    empWorkingHour =4;
                    break;
                default:
                    empWorkingHour = 0;

            }
            int dailyEmpWage = empWorkingHour * wagePerHour;
            System.out.println("Earning for Day " + day + " is : " + dailyEmpWage);
            totalEmpWage = totalEmpWage + dailyEmpWage ;

        }
        System.out.println("Total Earning for a 20 days is : " + totalEmpWage);
    }
    }
