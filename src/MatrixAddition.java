import java.util.Scanner;


public class MatrixAddition {

	public static int[][] createMatrix(int width, int height)
	{
		int[][] matrix = new int[width][height];
		for (int i=0; i<width; i++)
		{
			for (int j=0; j<height; j++)
			{
				System.out.println("Enter element (" + (i+1) + ", " + (j+1) + "): ");
				Scanner input = new Scanner(System.in);
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] addition(int[][] matrix1, int[][] matrix2)
	{
		int matrix3[][] = new int[matrix1.length][matrix1[0].length];
		for (int i=0; i<matrix1.length; i++)
		{
			for (int j=0; j<matrix1[0].length; j++)
			{
				matrix3[i][j] = matrix2[i][j] + matrix1[i][j];
			}
		}
		return matrix3;
	}
	
	public static void printMatrix(int[][] matrix)
	{
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[0].length; j++)
			{
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int[][] matrix1 = createMatrix(3, 3);
		int[][] matrix2 = createMatrix(3, 3);
		int[][] matrix3 = addition(matrix1, matrix2);
		System.out.println("First matrix: \n");
		printMatrix(matrix1);
		System.out.println("Second matrix: \n");
		printMatrix(matrix2);
		System.out.println("Matrix addition: \n");
		printMatrix(matrix3);
		
	}

}
