public class exerciseNumber2 {
    public static void main(String[] args) {

        int index = 25;
        int [] fib = new int[index];
        int sumEven = 0;

        fib[0] = 0;
        fib[1] = 1;
// Наполняю массив последовательностью Фибоначчи
        for (int i = 2; i < fib.length ; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
// Ищу четные элементы массива и суммирую
        for (int i = 0; i < index; i++) {
            if(fib[i] % 2 == 0){
                sumEven += fib[i];
            }

        }
        System.out.println("Сумма четных элементов последовательности до индекса "+ index +" равна = "+sumEven);



    }
}
