public class Employee {
	
    int employeeId; 
	int employeeBasic ; 
	int employeeHra ;
	int employeePF;
	int totalSalary;


	public void calculateTotalSalary(int empId, int empBasic, int empHra, int empPF){
	
    System.out.println("---------------------------------------------------------------");	
		
     employeeId=empId; 
	 employeeBasic=empBasic ; 
	 employeeHra=empHra ;
	 employeePF=empPF;
	

		System.out.println("Employee Id = "+employeeId);
		totalSalary=employeeBasic+employeeHra+employeePF;
		System.out.println("Total Deductions before deduction  = "+totalSalary);
		int deduction= 500;
		System.out.println("Total Deductions  = "+(deduction));
		System.out.println("Total Salary after deduction = "+(totalSalary-deduction));
		
		//Declared inside the method of a class stored in method Area
	}

}  