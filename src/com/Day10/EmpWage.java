package com.Day10;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Branch UC1_Emp_Check
        //Branch UC2_Emp_Daily_Wage
        //Branch UC3_Add_Part_time_Emp_wage
        Random random = new Random ();
        int emp_check = random.nextInt(3);
        int wagePerHr = 20;
        int fulldayHrs = 8;
        int partTimeHrs = 4;
        //Branch UC4_Switch_Case
        switch (emp_check)
        {
            case 0 :
                System.out.println("Employee is Absent"); break;

            //Branch UC3_Part_time_Emp_wage
            case 1 :
                System.out.println("Employee is working Part Time");
                int pt_Daily_wage = wagePerHr*partTimeHrs;
                System.out.println("Employee Daily Wage is " + pt_Daily_wage); break;


            case 2 :
                System.out.println("Employee is present");
                int ft_Daily_wage = wagePerHr*fulldayHrs;
                System.out.println("Employee Daily Wage is " + ft_Daily_wage); break;


        }
    }

}