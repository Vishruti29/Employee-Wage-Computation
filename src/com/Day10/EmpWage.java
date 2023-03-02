package com.Day10;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Branch UC1_Emp_Check
        Random random = new Random ();
        int emp_check = random.nextInt(2);
        if(emp_check==0) {
            System.out.println("Employee is Absent");
        }
        else {
            System.out.println("Employee is Present");
        }
    }
}