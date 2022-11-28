package EmployeeExample;

import java.util.Random;

public class EmpWageCondition {
    static final int fullTime=1;
    static final int partTime=2;


    public static void main(String[] args) {
        int emp_rate_per_hr = 20;
        int workingDays = 20;
        int empWorkingHour = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int workingHrs = 100;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int day = 0;
        while(totalEmpHrs <= workingHrs &&  day < workingDays)
        {
            double random = Math.floor(Math.random() * 10) %3;
            switch((int) random)
            {
                case fullTime:
                    empWorkingHour=8;
                    break;

                case partTime:
                    empWorkingHour=4;
                    break;

                default:
                    empWorkingHour=0;
            }
            empWage = empWorkingHour * emp_rate_per_hr;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHrs = totalEmpHrs + empWorkingHour;
            day++;
        }
         System.out.println("Total Number Of Hours: "+totalEmpHrs);
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }


}
