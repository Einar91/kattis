import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

// Template
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = Integer.parseInt(in.nextLine());

        for (int i=0; i < k; i++) {
            int n = Integer.parseInt(in.nextLine());
            String[] arr = in.nextLine().split(" ");

            int operations = 0;
            int position = 1;

            for (String num : arr) {
                if (position != Integer.parseInt(num)) {
                    operations++;
                } else {
                    position++;
                }
            }
            System.out.println(operations);
        }


    }


    static void sortingAlgTimeLimitFail(ArrayList<Integer> A, int low, int high) {
        int operations = 0;
        
        int lowIndex = A.indexOf(low);
        int i = 1;
        while (i < high) {
            int indexNext = A.indexOf(low + i);
            if (indexNext > lowIndex) {
                if (indexNext != lowIndex + i) {
                    A.add(A.remove(lowIndex + i));
                    operations++;
                } else {
                    i++;        
                }

            } else {
                A.add(A.remove(indexNext));
                operations++;
                lowIndex--;
            }
        }
        System.out.println(operations);

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