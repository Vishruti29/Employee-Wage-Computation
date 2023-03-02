package com.Day10;
public class EmpWage {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int emp_rate_per_hr = 20;
    public static final int working_days_in_month = 20;
    public static final int max_working_hrs_in_month = 100;
    public static void main(String[] args) {
        int emp_hrs;
        int total_emp_hrs = 0;
        int total_working_days = 0;
        while(total_emp_hrs <= max_working_hrs_in_month && total_working_days <= working_days_in_month)
        {
            total_working_days ++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case isPartTime:
                    emp_hrs = 4; break;
                case isFullTime:
                    emp_hrs = 8; break;
                default:
                    emp_hrs = 0;
            }
            total_emp_hrs += emp_hrs;
            System.out.println(" Day : " +total_working_days + " Employee Hrs : " +emp_hrs);
        }
        int totalEmpWage = total_emp_hrs * emp_rate_per_hr;
        System.out.println("Total Employee Wage : " + totalEmpWage);
    }

}