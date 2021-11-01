import java.util.Scanner;

// Template
class Main {
    public static void main(String[] args) {
        Tidtaker t = new Tidtaker();
        t.startTimer();
        Scanner in = new Scanner(System.in);

        int numDataSets = in.nextInt(); in.nextLine();

        int currentSet = 0;
        while (currentSet < numDataSets) {
            currentSet = in.nextInt();
            int[] A = new int[20];
            int teller = 0;
            while (teller < 20) {
                A[teller++] = in.nextInt();
            }
            in.nextLine();
            int steps = sort(A);
            System.out.println(Integer.toString(currentSet) + " " + steps);

            // Check input read correctly
            // for (int x : A) {
            //     System.out.print("" + x + " ");
            // }
            // System.out.println();
        }
        t.stopTimer();
        //System.out.println("Kjoretid i mikrosekunder: " + t.getRunTime());
    }

    public static int sort(int[] A) {
        int[] line = new int[A.length];
        int steps = 0;

        line[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            int student = A[i];
            boolean notInserted = true;
            int j = 0;
            while (notInserted) {
                if (A[i] < line[j]) {
                    steps += insertStudent(line, student, j);
                    notInserted = false;
                } else if (line[j] == 0) {
                    line[j] = student;
                    notInserted = false;
                }
                j++;
            }
        }
        return steps;
    }

    public static int insertStudent(int[] A, int student, int index) {
        if (A[index] == 0 || index == A.length-1) {
            A[index] = student;
            return 0;
        }
        int oldStudent = A[index];
        A[index] = student;
        return 1 + insertStudent(A, oldStudent, index+1);
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