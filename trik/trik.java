import java.util.Scanner;

class trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String moves = in.nextLine();

        int ballPlace = 1;

        for (char c : moves.toCharArray()) {
            if (c == 'A' && (ballPlace == 1 || ballPlace == 2)) {
                if (ballPlace == 1) {
                    ballPlace = 2;
                } else {
                    ballPlace = 1;
                }
            } 
            else if (c == 'B' && (ballPlace == 2 || ballPlace == 3)) {
                if (ballPlace == 2) {
                    ballPlace = 3;
                } else {
                    ballPlace = 2;
                }
            }
            else if (c == 'C' && (ballPlace == 1 || ballPlace == 3)) {
                if (ballPlace == 1) {
                    ballPlace = 3;
                } else {
                    ballPlace = 1;
                }
            }
        }
        System.out.println("" + ballPlace);
    }
}