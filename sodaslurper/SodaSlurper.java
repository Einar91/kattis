import java.util.Scanner;

class SodaSlurper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int f = in.nextInt();
        int c = in.nextInt();

        int emptyCans = e + f;
        int total = 0;
        while (emptyCans >= c) {
            int newBottles = emptyCans / c;
            total = total + newBottles;
            emptyCans = (emptyCans - (newBottles * c)) + newBottles;
        }
        System.out.println(Integer.toString(total));
    }
}