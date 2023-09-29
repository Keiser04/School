package JoEl;

import java.util.Scanner;

public class caramelos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caramelos = sc.nextInt();
        int niños = sc.nextInt();

        System.out.println(caramelos % niños); //Para mostrar el resto de una division es %
    }
}
