package question2;

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

	public static void spiralPrint(int rowCount, int columnCount, int[][] matrice) {
		int i, k = 0, l = 0;

		while (k < rowCount && l < columnCount) {

			for (i = l; i < columnCount; ++i) {
				System.out.print(matrice[k][i] + " ");
			}
			k++;

			for (i = k; i < rowCount; ++i) {
				System.out.print(matrice[i][columnCount - 1] + " ");
			}
			columnCount--;

			if (k < rowCount) {
				for (i = columnCount - 1; i >= l; --i) {
					System.out.print(matrice[rowCount - 1][i] + " ");
				}
				rowCount--;
			}

			if (l < columnCount) {
				for (i = rowCount - 1; i >= k; --i) {
					System.out.print(matrice[i][l] + " ");
				}
				l++;
			}
		}
	}
}
