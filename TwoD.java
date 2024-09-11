package org.example;

public class TwoD {
    public static void main(String[] args) {
        int t, i;
        int table[][] = new int[3][4];
        //Мы создаем двумерный массив table размером 3 на 4. Это означает, что у нас будет 3 строки и 4 столбца,
        //и массив будет хранить 12 целых чисел.

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }
    }
}
//Заполнение элемента массива table[t][i] значением, вычисляемым по формуле (t * 4) + i + 1.
//Для t = 0 (первая строка):
//table = (0 * 4) + 0 + 1 = 1
//table = (0 * 4) + 1 + 1 = 2
//table = (0 * 4) + 2 + 1 = 3
//table = (0 * 4) + 3 + 1 = 4
//Вывод: 1 2 3 4
//Для t = 1 (вторая строка):
//table = (1 * 4) + 0 + 1 = 5
//table = (1 * 4) + 1 + 1 = 6
//table = (1 * 4) + 2 + 1 = 7
//table = (1 * 4) + 3 + 1 = 8