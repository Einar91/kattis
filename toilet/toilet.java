import java.util.Scanner;

class toilet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sek = in.nextLine();
        int n = sek.length();
        char startPos = sek.charAt(0);

        int polOne = 0;
        int polTwo = 0;
        int polThree = 0;

        char next = sek.charAt(1);
        if (startPos == 'U') {
            if (next == 'D') {
                polOne = polOne + 2;
                polTwo = polTwo + 1;
                polThree = polThree + 1;
            }
            if (next == 'U') {
                //polOne nothing
                polTwo = polTwo + 1;
                //polThree nothing
            }
        }
        if (startPos == 'D') {
            if (next == 'U') {
                polOne = polOne + 1;
                polTwo = polTwo + 2;
                polThree = polThree + 1;
            }
            if (next == 'D') {
                polOne = polOne + 1;
                //polTwo nothing
                //polThree nothing
            }
        }

        for (int i=2; i < n; i++) {
            char last = next;
            next = sek.charAt(i);

            if (last == 'U') {
                if (next == 'D') {
                    polOne = polOne + 2;
                    polThree = polThree + 1;
                }
                if (next == 'U') {
                    polTwo = polTwo + 2;
                }
            }
            if (last == 'D') {
                if (next == 'U') {
                    polTwo = polTwo + 2;
                    polThree = polThree + 1;
                }
                if (next == 'D') {
                    polOne = polOne + 2;
                }
            }
        }
        System.out.println("" + polOne);
        System.out.println("" + polTwo);
        System.out.println("" + polThree);
    }
}