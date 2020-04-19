package question3;

public class Main {

	public static void main(String[] args) {

		MatriceOperations matriceOperations = new MatriceOperations();

		int[][] firstMatrice = matriceOperations.fillMatrice(2, 2);

		int[][] secondMatrice = matriceOperations.fillMatrice(2, 3);
		int[][] result;

		matriceOperations.printMatrice(firstMatrice);

		System.out.println("---------------------------------\n");
		matriceOperations.printMatrice(secondMatrice);

		System.out.print("---------------------------------\n");

		result = matriceOperations.multiplyMatrices(firstMatrice, secondMatrice);
		matriceOperations.printMatrice(result);

	}

}
