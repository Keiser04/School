package Estructures_de_control;

import java.util.Scanner;

public class diferencia {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = Math.abs(A - B); //Math.abs sirve para devolver el numero absoluto (quita el positivo y el negativo)

        System.out.println(C);
    }
}
