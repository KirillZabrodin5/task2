package org.example;


public class Task1 {
    public static void main(String[] args) {
        int counter = 0;
        int[] a = new int[]{1,2,-3,4,-5,-6,0};
        for(int i = 0; i < a.length; i++){
            if (a[i] > 0) {
                counter++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println("/n" + counter);
    }
}
