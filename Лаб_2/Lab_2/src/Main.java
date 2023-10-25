import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Number of rows in the matrix: ");
        int n = validate_dimension();
        System.out.print("Number of columns in the matrix: ");
        int m = validate_dimension();

        System.out.println("Enter " + n + " × " + m + " matrix");
        char[][] matrix_c = input_matrix(n, m);
        System.out.println("\nYour input matrix:");
        print_matrix(n, m, matrix_c);

        System.out.print("\nEnter the constant 'a' by which you want to multiply the matrix: ");
        char a = (char) validate();
        increment_matrix(n, m, a, matrix_c);
        System.out.println("\nYour modified matrix:");
        print_matrix(n, m, matrix_c);

        char sumMax = sumOddMax(n, m, matrix_c);
        char sumMin = sumEvenMin(n, m, matrix_c);
        System.out.println("\nThe sum of the largest elements in the rows of the matrix " +
                "with odd numbers - " + sumMax + " " + (short) sumMax);
        System.out.println("The sum of the smallest elements in the rows of the matrix " +
                "with even numbers - " + sumMin + " " + (short) sumMin);
    }

    public static int validate_dimension() {
        String reenterValue = "Enter your value again: ";
        Scanner in = new Scanner(System.in);
        boolean flag;
        int value = 0;
        do {
            flag = false;
            try {
                value = in.nextInt();
                if (value <= 0) {
                    System.out.println("Matrix dimension cannot be negative or zero!");
                    System.out.print(reenterValue);
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println("Type of variable must be integer!");
                System.out.print(reenterValue);
                in.next();
                flag = true;
            }
        } while (flag);
        return value;
    }

    public static char[][] input_matrix(int n, int m) {
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("C[" + i + "][" + j + "] = ");
                matrix[i][j] = (char) validate();
            }
        }
        return matrix;
    }

    public static float validate() {
        String reenterValue = "Enter your value again: ";
        Scanner in = new Scanner(System.in);
        boolean flag;
        int value = 0;
        do {
            flag = false;
            try {
                value = in.nextInt();
                if (value < 0 || value > 65535) {
                    System.out.println("The value must be in the range char [0; 65535]");
                    System.out.print(reenterValue);
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println("Type of variable must be integer!");
                System.out.print(reenterValue);
                in.next();
                flag = true;
            }
        } while (flag);
        return value;
    }

    public static void increment_matrix(int n, int m, char a, char[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] *= a;
            }
        }
    }

    public static char sumOddMax(int n, int m, char[][] matrix) {
        char max, sum = 0;
        for (int i = 1; i < n; i += 2) {
            max = matrix[i][0];
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
            sum += max;
        }
        return sum;
    }

    public static char sumEvenMin(int n, int m, char[][] matrix) {
        char min, sum = 0;
        for (int i = 0; i < n; i += 2) {
            min = matrix[i][0];
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
            sum += min;
        }
        return sum;
    }

    public static void print_matrix(int n, int m, char[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\t");
            for (int j = 0; j < m; j++) {
                System.out.print((int) matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
