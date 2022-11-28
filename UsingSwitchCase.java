package EmployeeExample;

public class UsingSwitchCase {
    public static void main(String[] args) {
        int Full_Time = 1;
        int Part_Time = 2;
        int wagePerHour = 20;
        int empWorkingHrs =0 ;
        int empWage;

        double random = Math.floor(Math.random() * 10) %3;

        switch ((int) random){
            case 1:
                empWorkingHrs = 8;
                System.out.println("Employee is present for Full Time");
                break;
            case 2:
                empWorkingHrs = 4;
                System.out.println("Employee is present for Part Time");
                break;
            default:
                empWorkingHrs = 0;
                System.out.println("Employee is Absent");
        }
        empWage = empWorkingHrs * wagePerHour;
        System.out.println("Employee's daily wage is: " + empWage);
    }
}
