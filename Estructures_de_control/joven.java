package Estructures_de_control;

import java.util.Scanner;

public class joven {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int edad = sc.nextInt();

        if (edad < 32){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
}
