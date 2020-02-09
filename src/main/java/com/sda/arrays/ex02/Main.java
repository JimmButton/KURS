package com.sda.arrays.ex02;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5, 6};
        System.out.println(krystynaZGazowni(tablica));
    }

    public static String krystynaZGazowni(int[] array) {
        String tekst = "";
         tekst+= ("{");
        for (int i = 0; i < array.length; i++) {
            tekst+=(array[i]);
            if(i<array.length-1){
                tekst+= (", ");
            }
        }
       tekst += ("}");
        return tekst;
    }
}


