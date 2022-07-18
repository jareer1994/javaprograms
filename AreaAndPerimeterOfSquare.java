import java.util.Scanner;

public class AreaAndPerimeterOfSquare {

	
	public int areaOfSquare(int side) {
		return side*side;
	}
	
	public void perimeterOfSquare(int side) {
		System.out.println("Perimeter of Square = "+(4*side));
	}
	
	public void calculatePlotCost(int costPerSqYd, int area) {
		System.out.println("Total plot cost (Cost per Sq. Yard X side X side) = "+(costPerSqYd*area));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the side ");
		int side= input.nextInt();
		
		System.out.println("Enter cost of per sq. yard");
		int costPerSqYd= input.nextInt();
		
		AreaAndPerimeterOfSquare anilSquare = new AreaAndPerimeterOfSquare();
		int area=anilSquare.areaOfSquare(side);
		
		anilSquare.perimeterOfSquare(side);
		anilSquare.calculatePlotCost(costPerSqYd,area);
		
	}

}
