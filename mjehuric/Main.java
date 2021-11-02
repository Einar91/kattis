import java.util.Scanner;

// Template
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = in.nextInt();
        }
        while(!isSorted(A)) {
            sort(A);
        }
    }

    public static void sort(int[] A) {
        if (A[0] > A[1]) {
            swap(A, 0, 1);
        }
        if (A[1] > A[2]) {
            swap(A, 1, 2);
        }
        if (A[2] > A[3]) {
            swap(A, 2, 3);
        }
        if (A[3] > A[4]) {
            swap(A, 3, 4);
        }
    }

    public static void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
        printArray(A);
    }

    public static void printArray(int[] A) {
        for (int x : A) {
            System.out.print(Integer.toString(x) + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int[] A) {
        int i = 1;
        while (i < A.length) {
            if (A[i-1] > A[i]) {
                return false;
            }
            i++;
        }
        return true;
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