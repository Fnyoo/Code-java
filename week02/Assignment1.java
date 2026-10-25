public class Assignment1 {
    
    public static void main(String [] args){
        double basicsalary = 3000000;
        double childallowance = 150000;
        double pensiondeduction = 0.05;
        int numberofchildren = 3;

        double totalchildallowance = childallowance * numberofchildren;
        double totalpension = basicsalary * pensiondeduction;
        double netsalary = basicsalary + totalchildallowance - totalpension;

        System.out.println("Basic salary: Rp " + basicsalary);
        System.out.println("Total Child Allowance: Rp " + totalchildallowance);
        System.out.println("Pension Deduction: Rp " + totalpension);
        System.out.println("Net Salary: Rp " + netsalary);

    }

}
