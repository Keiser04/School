package Estructures_de_control;

import java.sql.SQLOutput;
import java.util.Scanner;

public class diferencia2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max1 = Math.max(A, B);
        int max2 = Math.max(max1, C);

        int min1 = Math.min(A, B);
        int min2 = Math.min(min1, C);

        int definitivo = Math.abs(max2 - min2);

        System.out.println(definitivo);
    }
}
