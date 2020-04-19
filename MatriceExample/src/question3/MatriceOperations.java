package question3;

public class MatriceOperations {

	public int[][] fillMatrice(int rowCount, int columnCount) {

		int[][] matrice = new int[rowCount][columnCount];

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				int matriceValue = (int) (Math.random() * (10 - 0));
				matrice[i][j] = matriceValue;
			}
		}

		return matrice;

	}

	public void printMatrice(int[][] matrice) {

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				System.out.print(matrice[i][j] + " ");
			}

			System.out.print("\n");
		}
	}

	public int[][] multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice) {

		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];

		for (int i = 0; i < resultMatrice.length; i++) {

			for (int j = 0; j < resultMatrice[0].length; j++) {

				int result = 0;
				for (int k = 0; k < secondMatrice.length; k++) {
					result += firstMatrice[i][k] * secondMatrice[k][j];
				}
				resultMatrice[i][j] = result;
			}

		}

		return resultMatrice;
	}
}
