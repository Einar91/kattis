import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 1000;

        for (int i=0; i < 10; i++) {
            int guess = (low+high) / 2;
            System.out.println(guess);

            String r = sc.nextLine();
            if (r.equals("higher")) {
                low = guess + 1;
            }
            else if (r.equals("lower")) {
                high = guess - 1;
            }
            else {
                break;
            }
        }
    }
}