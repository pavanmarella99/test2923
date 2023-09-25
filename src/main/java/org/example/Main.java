package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int x = 0;
        int y =0;
        int a = 10;
        int[] arr = new int[10];
        float b = 9.4f;
        float sum;
        sum = a + b;
        System.out.println("Sum of 2 numbers is:" + sum);
        for (int i = 1; i <= 10; i++) {
            if (i == 1){
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    x =x+ 1;
                }
            }
            if (x<3) {
                arr[y] = i;
                y++;
                //System.out.println("prime number is," + i);
            }
            x=0;
        }
        for (int j : arr) {
            if (j != 0) {
                System.out.print(j + "  ");
            }
        }

    }
}