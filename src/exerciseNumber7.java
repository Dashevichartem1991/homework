import java.util.Random;
public class exerciseNumber7 {
    public static void main(String[] args) {
        int [] array = new int[5];
        int sum = 0;
        int maxNum = 99;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxNum);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = i + 2; k < array.length; k++) {
                    for (int l = i + 3; l < array.length; l++) {
                        if(array[i] > array [j] && i == 0) {
                            sum = sum + array[i] + array[k];
                        } else if(array[i] < array[j] ){
                            sum = sum + array[j] + array[l];
                        }
                    }
                }
            }
        }
        System.out.println("Сумма равна = "+ sum);
    }
}
