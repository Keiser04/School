package JoEl;

import java.util.Scanner;

public class sumar_segundo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        S++;
     if (S == 60){
         S=0;
         M++;
     }
     if (M == 60){
         M=0;
         H++;
     }
     if (H == 24){
         H=0;
     }
     System.out.println(H + " " + M + " " + S);
    }
}
