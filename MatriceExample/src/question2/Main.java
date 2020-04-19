package question2;

public class Main {

	public static void main(String[] args) {
		
		MatriceOperations matriceOperations= new MatriceOperations();
		
		int[][] spiralMatrice = matriceOperations.fillMatrice(5, 5);
		matriceOperations.printMatrice(spiralMatrice);
		
		System.out.println("-----------------------");
		
		matriceOperations.spiralPrint(5, 5, spiralMatrice);
		

		
		

	}

}
