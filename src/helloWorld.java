//Дан одномерный массив целых чисел.
//Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый
// массив с только положительными элементами).
//После удаления - умножить каждый элемент массива на его длину.
//Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
//
//Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только
// для тестирования написанного функционала
public class helloWorld {
    public static void main(String[] args) {
        int[] are = {3, 5, -  6, 3, 2, -9, 0, -123};
        int[] dre = sum(are);
        for (int i : dre) {
            System.out.println(i);

        }
    }


    public static int[] sum(int[] are) {
        int count = 0;
        for (int i = 0; i < are.length; i++) {
            if (are[i] >= 0) {
                count++;
            }
        }
        ;

        int[] resArr = new int[count];
        for (int i = 0, j = 0; j < are.length; j++) {
            if (are[j] >= 0) {
                resArr[i]=are[j]*5;
                i++;
            }
        }
        ;
        return resArr;
    }

    ;

};