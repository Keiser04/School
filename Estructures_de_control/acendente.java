package Estructures_de_control;

import java.util.Scanner;

public class acendente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 < n2 && n2 < n3){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }

    }
}
