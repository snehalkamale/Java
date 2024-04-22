package wiproproject;
import java.util.Scanner;

public class Matrix {
   	    int rows;
	    int columns;
	    int[][] matrix;

	       public Matrix(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        this.matrix = new int[rows][columns];
	    }
	   	    public void InitializeMatrix() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	         }
	   	    public void printMatrix() {
	        System.out.println("Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();
	        Matrix matrix = new Matrix(rows, columns);
	        matrix.InitializeMatrix();
	        matrix.printMatrix();
       	    }
	}
 