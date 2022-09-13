package EmployeeExample;

import java.util.Random;

public class EmpCheck {
    public static void main(String[] args) {
        Random rd = new Random();
        int present = rd.nextInt(2);

        if(present == 1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
