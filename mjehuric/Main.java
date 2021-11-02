import java.util.Scanner;

// Template
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


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