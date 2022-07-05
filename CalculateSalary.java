public class CalculateSalary {

   public static void main(String args[]){
     
	  Employee anilSalary = new Employee();
	  //Pass in the values in order first is emp Id, basic, hra, pf
	  anilSalary.calculateTotalSalary(102, 3000, 400, 100);
	  
	  
	  Employee ashokSalary = new Employee();
	  ashokSalary.calculateTotalSalary(122,5000,2000,4000);
	  
	  Employee SunilSalary = new Employee();
	  ashokSalary.calculateTotalSalary(123,7000,1000,1000);
 
   }

}