import java.util.Scanner;

class Prsteni {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n_rings = in.nextInt();in.nextLine();
        int first_ring = in.nextInt();

        for (int i=0; i < n_rings-1; i++) {
            int next_ring = in.nextInt();
            int gcd = greatestCommonDivisor(first_ring, next_ring);
            int a = first_ring / gcd;
            int b = next_ring / gcd;
            System.out.println(Integer.toString(a) + "/" + Integer.toString(b));
        }
    }

    static int greatestCommonDivisor(int a, int b) {
        if (b == 0)
            return a;
        return greatestCommonDivisor(b, a % b);
    }
}