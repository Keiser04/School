package Estructures_de_control;

import java.util.Scanner;

public class divisible {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N2 = N/2;
        int N3 = N/3;
        int N5 = N%5;
        int N7 = N/7;



if (N2 == 0 || N3 == 0 || N5 == 0 || N7 == 0){
 System.out.println("SI");
    }
    else{
        System.out.println("NO");
    }
}
    }