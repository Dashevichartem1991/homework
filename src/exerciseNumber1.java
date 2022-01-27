public class exerciseNumber1 {
    public static void main(String[] args) {
        int [] array = new int[7];
        int someNum = 12;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 7;
            if (array[i] == someNum){
                continue;
            }else{
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
