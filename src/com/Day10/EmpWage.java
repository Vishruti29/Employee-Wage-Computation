package com.Day10;
public class EmpWage {
    private static final int isPartTime = 1;
    private static final int isFullTime = 2;
    private final String companyName;
    private final int max_working_hrs_in_month;
    private final int working_days_in_month;
    private final int emp_rate_per_hr;

    EmpWage(String companyName, int max_working_hrs_in_month, int working_days_in_month, int emp_rate_per_hr){
        this.companyName = companyName;
        this.max_working_hrs_in_month = max_working_hrs_in_month;
        this.working_days_in_month = working_days_in_month;
        this.emp_rate_per_hr = emp_rate_per_hr;

    }
    public static void main(String[] args) {
        EmpWage e1 = new EmpWage("CGL", 100, 20, 20);
        EmpWage e2 = new EmpWage("ABB", 150, 25, 25);
        e1.employeeWageComputation();
        e2.employeeWageComputation();
    }
    void employeeWageComputation() {

        System.out.println("Welcome to Employee Wage Computation Program");
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
        System.out.println("Monthly total wage for " + companyName + " : " + totalEmpWage );
    }
}