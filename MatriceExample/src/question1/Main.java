package question1;

public class Main {

	public static void main(String[] args) {

		MatriceOperations matriceOperations = new MatriceOperations();

		int[][] firstMatrice = matriceOperations.fillMatrice(5, 5);

		matriceOperations.printMatrice(firstMatrice);

	
		System.out.print("---------------------------------\n");
		
		
		
		firstMatrice = matriceOperations.transformCells(firstMatrice);
		matriceOperations.printMatrice(firstMatrice);

	
	
	
	}

}
