package com.sda.arrays.ex01;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5, 6};
        printArray (tablica);
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
