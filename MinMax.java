package org.example;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];

        //Устанавливаем начальные значения для min и max. Оба значения инициализируются первым элементом массива nums,
        // который равен 99. Это делается для того, чтобы упростить последующий поиск минимума и максимума.

        for (int i = 1; i < 10; i++) {

            //Если текущий элемент nums[i] меньше, чем текущее значение min, мы обновляем min на значение nums[i].

            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
