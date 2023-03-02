package com.Day10;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Branch UC1_Emp_Check
        //Branch UC2_Emp_Daily_Wage
        //Branch UC3_Add_Part_time_Emp_wage
        //Branch UC5_Wage_per_Month
        Random random = new Random ();
        int emp_check = random.nextInt(3);
        int WagePerHr = 20;
        int FulldayHrs = 8;
        int PartTimeHrs = 4;
        int TotalWorkingDays = 20;
        //Branch UC4_Switch_Case
        switch (emp_check)
        {
            case 0 :
                System.out.println("Employee is Absent"); break;

            //Branch UC3_Part_time_Emp_wage
            case 1 :
                System.out.println("Employee is working Part Time");
                int PT_Daily_wage = WagePerHr*PartTimeHrs;
                int PT_MonthlyWage = PT_Daily_wage*TotalWorkingDays;
                System.out.println("Employee Daily Wage is " + PT_Daily_wage);
                System.out.println("Employee Monthly Wage is " + PT_MonthlyWage); break;


            case 2 :
                System.out.println("Employee is present");
                int FT_Daily_wage = WagePerHr*FulldayHrs;
                int FT_MonthlyWage = FT_Daily_wage*TotalWorkingDays;
                System.out.println("Employee Daily Wage is " + FT_Daily_wage);
                System.out.println("Employee Monthly Wage is " + FT_MonthlyWage); break;


        }
    }
}