package EmployeeExample;

import java.util.Random;

public class EmpCheck {
    public static void main(String[] args) {
        int isPresent = 1;
        double random = Math.floor(Math.random() * 10) %2;

        if(random == isPresent){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
