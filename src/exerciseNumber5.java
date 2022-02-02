public class exerciseNumber5 {
    public static void main(String[] args) {
    int[][] matrix = {{1, 0, 0, 0}, {1, 2, 0, 0}, {1, 2, 3, 0},{1, 2, 3, 4}};
    boolean compare = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                if (matrix[i][j] != 0){
                        compare = false;
                        break;
                    }
                }
            }

        if (compare == true){
            System.out.println("Это нижняя тругольная матрицы");
        }else{
            System.out.println("Это не нижняя тругольная матрицы");
        }
    }
}
