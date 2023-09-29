package Estructures_de_control;

import java.util.Scanner;

public class contigus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int n11 = n1++;
        int n22 = n2++;

        if(n1 == n22 || n2 == n11){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
}
