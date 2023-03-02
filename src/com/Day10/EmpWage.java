package com.Day10;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args) {
        //Branch UC1_Emp_Check
        //Branch UC2_Emp_Daily_Wage
        //Branch UC3_Add_Part_time_Emp_wage
        Random random = new Random ();
        int emp_check = random.nextInt(3);
        int WagePerHr = 20;
        int FulldayHrs = 8;
        int PartTimeHrs = 4;
        if(emp_check==0) {
            System.out.println("Employee is Absent");
        }
        else if(emp_check==1){
            System.out.println("Employee is working Part Time");
            int dailyWage = WagePerHr*PartTimeHrs;
            System.out.println("Employee Daily Wage is " + dailyWage);

        }
        else {
            System.out.println("Employee is Present");
            int dailyWage = WagePerHr*FulldayHrs;
            System.out.println("Employee Daily Wage is " + dailyWage);
        }
    }

}