package org.example;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Paзмep списка: " + list.length);
        System.out.println("Paзмep nums: " + nums.length);
        System.out.println("Paзмep table: " + table.length);
        System.out.println("Paзмep table[0]: " + table[0].length);
        System.out.println("Paзмep table[1]: " + table[1].length);
        System.out.println("Paзмep table[2]: " + table[2].length);
        System.out.println();
        // Использовать переменную length для инициализации списка
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;
        System.out.println("Содержимое списка: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
