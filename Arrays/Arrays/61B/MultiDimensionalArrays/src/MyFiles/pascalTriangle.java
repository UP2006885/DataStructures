package MyFiles;

public class pascalTriangle {
    public int n;
    private int[][] pt;

    public pascalTriangle(int n) {
        this.n = n;
        pt = new int[n][];
    }

    public void generateTriangle(){
        for(int i = 0; i<n; i++){
            pt[i] = new int [i + 1];
            pt[i][0] = 1;
            for (int j = 1; j<i; j++){pt[i][j] = pt[i-1][j-1] + pt[i-1][j];}
            pt[i][i] = 1;
        }
    }

    public int[][] returnTriangle(){
        generateTriangle();
        return pt;
    }

    String string = "";
    public void displayTriangles(){
        for(int i = 0; i < n; i++){
            string = "";
            for(int j = 0; j <= i; j++){
                string += pt[i][j];
//                System.out.println(pt[i][j]);
            }
            System.out.println(string);
        }
    }
}
