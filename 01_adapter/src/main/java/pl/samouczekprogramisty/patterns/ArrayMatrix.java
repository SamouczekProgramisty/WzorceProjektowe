package pl.samouczekprogramisty.patterns;

public class ArrayMatrix implements Matrix {
    private final int[][] matrix;

    public ArrayMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int get(int x, int y) {
        return matrix[y][x];
    }

    @Override
    public int size() {
        return matrix.length;
    }
}
