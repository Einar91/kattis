import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numNames = in.nextInt(); in.nextLine();
        while (numNames != 0) {
            String[] names = new String[numNames];
            for (int i=0; i < numNames; i++) {
                names[i] = in.nextLine().trim();
            }
            sort(names);
            printOutput(names);
            
            //Check for next set of names
            numNames = in.nextInt(); in.nextLine();
        }


    }

    public static void sort(String[] A) {
        int n = A.length;

        for (int i=1; i < n; i++) {
            int j = i;
            while (j > 0 && A[j-1].substring(0, 2).compareTo(A[j].substring(0, 2)) > 0) {
                String t = A[j-1];
                A[j-1] = A[j];
                A[j] = t;
                j--;
            }
        }
    }

    public static void printOutput(String[] A) {
        for (String s : A) {
            System.out.println(s);
        }
        System.out.println();
    }

}


class Tidtaker {
    long startTime;
    long endTime;
    
    void startTimer() {
        endTime = 0;
        startTime = System.nanoTime();
    }
    
    void stopTimer() {
        endTime = System.nanoTime();
    }

    // Runtime i mikrosekunder
    // Et mikrosekund er det samme som et milliondels sekund
    long getRunTime() {
        return (endTime - startTime) / 1000;
    }
}