package E2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio;
        int victoria = 0;
        int derrota = 0;
        int total = 0;
        boolean salir = false;

        System.out.println("Que vols jugar?");
        System.out.println("1 - Daus");
        System.out.println("2 - Parxís");
        System.out.println("3 - Tres en ratlla");
        System.out.println("4 - sortir");
        opcio = scanner.nextInt();
        while (opcio < 1 || opcio > 4) {
            System.out.println("opcio no valida torna a intentar");
            opcio = scanner.nextInt();
        }
        switch (opcio) {
            case 1:
            //aquí es comença la primera partida y es llençen els daus
                while(!salir) {
                    JocDaus partida = new JocDaus();
                    total++;
                    if (partida.jugar()) {
                        System.out.println("has guanyat");
                        victoria++;
                    } else {
                        System.out.println("has perdut");
                        derrota++;
                    }

                    //per tornar a jugar
                    System.out.println("vols seguir jugant (entra 1 per SI o un 0 per N0)");
                    opcio = scanner.nextInt();

                        if (opcio == 1) {
                            System.out.println("Següent partida");
                        }
                        if (opcio == 0) {
                            salir = true;
                        }

                }
                break;
            case 2:
                System.out.println("wip");
                break;
            case 3:
                System.out.println("wip");
                break;

            case 4:
                System.exit(0);
                break;

        }
        System.out.println("has fet "+total+" partides, has guanyat "+victoria+" i has perdut "+derrota);



    }
}
