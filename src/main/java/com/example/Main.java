package com.example;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        int h[];
        Float x[];
        double[][] doubleArray = new double[10][12];
        h = new int[10];
        x = new Float[12];
        int numbers = 4;
        for(int i = 0; i < 10; i++){
            h[i] = numbers;
            numbers += 2;
        }
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 12; k++){
                Random r = new Random();
                float f = (-11 + (r.nextFloat() * (4 - (-11))));
                x[k] = f;
            }
            for(int j = 0; j < 12; j++) {
                if (h[i] == 18) {
                    double znach18 = Math.tan(Math.cbrt(Math.pow(Math.E, x[j])));
                    double scale = Math.pow(10, 4);
                    double znach18Ceil = Math.ceil(znach18 * scale) / scale;
                    doubleArray[i][j] = znach18Ceil;
                }
                if (h[i] == 10 || h[i] == 14 || h[i] == 16 || h[i] == 20 || h[i] == 22){
                    double znachTenToTwTw = Math.tan(Math.pow( (4/(Math.asin( (x[j] - 3.5) / 15 ))) ,2));
                    double scale = Math.pow(10, 4);
                    double znachTenToTwTwCeil = Math.ceil(znachTenToTwTw * scale) / scale;
                    doubleArray[i][j] = znachTenToTwTwCeil;
                }
                if (h[i] == 4 || h[i] == 6 || h[i] == 8 || h[i] == 12){
                    double znachOther = Math.atan(1/ (Math.pow(Math.E, (Math.pow(Math.sin(Math.atan(Math.pow(Math.E, (Math.cbrt(Math.pow(4*Math.abs(x[j]),2))) ))),2)) )) );
                    double scale = Math.pow(10, 4);
                    double znachOtherCeil = Math.ceil(znachOther * scale) / scale;
                    doubleArray[i][j] = znachOtherCeil;
                }
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(Arrays.toString(doubleArray[i]));
        }
    }
}
