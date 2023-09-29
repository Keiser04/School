package JoEl;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        if (frase.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (frase.equals("Coneixement")) { //En caso de string no se puede usar == para verificar que sea igual,
            System.out.println("Ravenclaw");//se tiene que usar  variable.equals("la palabra que quieres")
        } else if (frase.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}
