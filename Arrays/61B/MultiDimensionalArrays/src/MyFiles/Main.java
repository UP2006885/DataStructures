package MyFiles;

public class Main {

    public static void main(String[] args) {
    // Pascals Triangle
        // A multidimensionalArray, is an array of arrays.

    pascalTriangle pt = new pascalTriangle(5);
    int[][] part;
    part = pt.returnTriangle();
//    System.out.println(part[1][0]);
    pt.displayTriangles();

    }
}
