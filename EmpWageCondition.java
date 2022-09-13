package EmployeeExample;

import java.util.Random;

public class EmpWageCondition {
    static final int fullTime=1;
    static final int partTime=2;
    static int ratePerHr=20;
    static int TotalDays=20;

    public static void main(String[] args) {

        int empHrs = 0;
        int salary = 0;
        int TotalSalary=0;
        int day=0;
        int noOfHrs=0;
        while(day<TotalDays && noOfHrs<=100)
        {

            Random rd = new Random();
            int empCheck = rd.nextInt(3);
//            System.out.println("Random No is: " );
            System.out.println(+empCheck);
            switch(empCheck)
            {
                case fullTime:
                    empHrs=8;
                    salary=empHrs*ratePerHr;
                    break;

                case partTime:
                    empHrs=4;
                    salary=empHrs*ratePerHr;
                    break;

                default:
                    empHrs=0;
            }
            TotalSalary=TotalSalary+salary;
            noOfHrs=noOfHrs+empHrs;
            day++;
        }
        System.out.println("Total Number Of Hours: "+noOfHrs);
        System.out.println("Total Employee Wage: "+TotalSalary);
    }


}
