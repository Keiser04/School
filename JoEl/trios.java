package JoEl;

import java.util.Scanner;

public class trios {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        int C3 = sc.nextInt();

        if (C1 < 1 || C1 > 13 || C2 < 1 || C2 > 13 || C3 < 1 || C3 > 13){
            System.out.println("NO");
        }
        if (C1 == C2 && C2 == C3){
            System.out.println("SI");

        }
        else{
            System.out.println("NO");
        }
    }
}
