public class exerciseNumber4 {
    public static void main(String[] args) {
        int[][] array = {{2 , -4}, {-5 , -8 }};
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0){
                    positive++;
                }else{
                    negative++;
                }
            }
        }
        if (positive > negative){
            System.out.println("Положительных чисел в массиве больше");

        }else if (positive < negative){
            System.out.println("Отрицательных чисел в массиве больше");

        }else{
            System.out.println("Отрицательных и положительных чисел в массиве поровну");

        }
    }
}
