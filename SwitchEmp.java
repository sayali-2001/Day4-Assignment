package EmployeeExample;

import java.util.Random;

public class SwitchEmp {


    public static void main(String[] args) {

        int ratePerHr=20;
        int salary;
        int empHrs=0;

        //computation
        Random rd = new Random();
        int empCheck = rd.nextInt(3);

            switch (empCheck) {
                case 1:
                    System.out.println("Emloyee is Fulltime");
                    empHrs = 8;
                    salary = empHrs * ratePerHr;
                    System.out.println("Employee Wage: " + salary);
                    break;

                case 2:
                    System.out.println("Employee is PartTime");
                    empHrs = 4;
                    salary = empHrs * ratePerHr;
                    System.out.println("Employee Wage: " + salary);
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
        }
    }

