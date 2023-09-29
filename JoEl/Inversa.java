package JoEl;

import java.util.Scanner;

public class Inversa {
    public static void main(String[] args){
        Scanner escan = new Scanner(System.in);

        float num = escan.nextFloat();

        num = (1/num);

        System.out.println(num);
    }
}
