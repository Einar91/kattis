import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class weakvertices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int antNoder = in.nextInt(); in.nextLine();
        while (antNoder >= 0) {
            int[][] graf = new int[antNoder][antNoder];

            for (int i=0; i < antNoder; i++) {
                for (int j=0; j < antNoder; j++) {
                    graf[i][j] = in.nextInt();
                }
                in.nextLine();
            }
    
            for (int i=0; i < antNoder; i++) {
                boolean svak = true;
                for (int j=0; j < antNoder; j++) {
                    for (int k=0; k < antNoder; k++) {
                        if(graf[i][j] == 1 && graf[i][k] == 1 && graf[j][k] == 1 && i != j && i != k) {
                            svak = false;
                        }
                    }
                }
                    
                if (svak) {
                    System.out.print("" + i + " ");
                }
            }
            System.out.println();
            antNoder = in.nextInt(); in.nextLine();
        }
        

    }

}