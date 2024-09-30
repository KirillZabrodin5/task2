package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            list.add(Math.random() * 100);
        }

        System.out.println("Исходный список: " + list);

        insertionSort(list);

        System.out.println("Отсортированный список: " + list);
    }

    public static void insertionSort(List<Double> list) {
        for (int i = 1; i < list.size(); i++) {
            Double key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
