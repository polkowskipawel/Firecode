package com.company;
public class Main {

    public static void main(String[] args) {

        int macierz[][] = new int[5][5];

        int pom = 0;
        for (int i = 0; i < macierz.length; i++) {
            System.out.print("nastepny wiersz=" + i + " ");
            for (int j = 0; j < macierz[i].length; j++) {
                macierz[i][j] = i;
                System.out.print(macierz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = (macierz.length-1); i >= 0; i--) {
            System.out.print("nastepny wiersz=" + (pom++) + " ");
            for (int j = macierz[i].length-1; j >=0; j--) {
                System.out.print(macierz[i][j]);
            }
            System.out.println();


        }
    }
}