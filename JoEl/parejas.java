package JoEl;
import java.util.Scanner;

public class parejas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        int C3 = sc.nextInt();

        if (C1 > 13 || C1 < 1 || C2 < 1 || C2 > 13 || C3 < 1 || C3 > 13 ) {
            System.out.println("NO");
        }
        else if (C1 == C2 || C2 == C3 || C3 == C1) {
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }
    }
}
