package pl.samouczekprogramisty.patterns;


public class MatrixOperations {
    public static int largest(Matrix m) {
        if (m.size() == 0) {
            throw new IllegalArgumentException("Matrix is empty!");
        }
        int largest = m.get(0, 0);
        for (int x = 0; x < m.size(); x++) {
            for (int y = 0; y < m.size(); y++) {
                if (m.get(x, y) > largest) {
                    largest = m.get(x, y);
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int size = 3;
        int[][] matrix = new int[size][];
        for (int row = 0; row < size; row++) {
            matrix[row] = new int[size];
        }
        matrix[0][2] = 4;
        System.out.println(MatrixOperations.largest(new ArrayMatrix(matrix)));

        MapMatrix mm = new MapMatrix(size);
        mm.set(2, 0, 44);
        System.out.println(MatrixOperations.largest(mm));
    }
}
