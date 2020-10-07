package E1;

import java.util.Random;
import java.util.Scanner;

public class DAU{

    public static void main (String [] args){
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        int d1,d2;
        int f [] = new int [12];
        int tiradas;
        System.out.println("Quants cops vols tirar?");
        tiradas = sc.nextInt();

        for(int i=0; i<tiradas;i++){
            d1 = rng.nextInt(6)+1;
            d2 = rng.nextInt(6)+1;
            ++f[d1+d2-2];
        }

        for(int i=0;i<12;i++){
            System.out.println(i+1+" ha sortit "+f[i]+" cops ");
        }

    }
}
