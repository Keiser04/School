package JoEl;

import java.util.Scanner;

public class Hogwarts2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();


        switch (frase){
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }
    }
}
