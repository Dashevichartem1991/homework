public class exerciseNumber3 {
    public static void main(String[] args) {
        String [] array = {"Понедельник" , "Вторник" , "Среда" , "Четверг" , "Пятница" , "Суббота" , "Воскресенье"};
        String invert;
//Инвентируем массив
        for (int i = 0; i < array.length / 2; i++) {
            invert = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = invert;

        }
//Выводим инвертированный массив
        for (String elements: array) {
            System.out.println(elements);
            
        }
    }
}
