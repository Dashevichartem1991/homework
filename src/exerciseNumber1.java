public class exerciseNumber1 {
    public static void main(String[] args) {
        int [] array = new int[7];
        int someNum = 12;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 7;
            System.out.println(array[i]);
            if (array[i] != someNum){
                sum += array[i];
            }
        }
        System.out.println("Сумма равна " + sum);
    }
}
