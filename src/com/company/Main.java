package com.company;

public class Main {

    public static void main(String[] args) {
        double [] numbers = {-5.7, 3.5, 5.6, -7.5, 5.1, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1, 7.9};
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] < 0) {
                continue;
            }else {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void mers (){
        int [] duck = {-4, -2, 2, 3, 6, 8};
        for (int y = 0; y < duck.length; y ++) {
            int naruto = duck [y];
            int konoha = y;
            for (int o = y + 1; o < duck.length; o++) {
                if (duck[o] < naruto);
                naruto =  duck [o];
                konoha = o;
                if (y != konoha){
                    int radio = duck [y];
                    duck [y] = duck [konoha];
                    duck [konoha] = radio;
                }

            }

        }
    }

}
