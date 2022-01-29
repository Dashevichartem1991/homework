public class exerciseNumber6 {
    public static void main(String[] args) {

        int [][] arrayOne = new int[4][4];
        int [][] arrayTwo = new int[4][4];
        int [][] arraySum = new int[4][4];
        int [][] arrayDef = new int[4][4];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                arrayOne[i][j] = i + 12;
            }
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                arrayTwo[i][j] = j + 10;
            }
        }

        for (int i = 0; i < arrayOne.length; i++) {

            for (int j = 0; j < arrayOne.length; j++) {
               arraySum[i][j] = arrayOne[i][j] + arrayTwo[i][j];
               arrayDef[i][j] = arrayOne[i][j] - arrayTwo[i][j];
            }
        }
    }
}
