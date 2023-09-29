package Estructures_de_control;

import java.util.Scanner;

public class votos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Jiden = sc.nextInt();
        int Drump = sc.nextInt();
        int Banders = sc.nextInt();
        if (Jiden > Drump && Jiden > Banders){
            System.out.println("Jiden");
        } else if (Drump > Jiden && Drump > Banders) {
            System.out.println("Drump");
        }else if (Banders > Jiden && Banders > Drump) {
            System.out.println("Banders");
        }
        else {
            System.out.println("No");
        }
    }
}
