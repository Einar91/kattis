// PID: ofugsnuid
import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        int[] numbers = new int[n];
        int i = 0;
        while (i < n) {
            numbers[i++] = in.nextInt(); in.nextLine();
        }
        int j = n-1;
        while (j >= 0) {
            System.out.println(Integer.toString(numbers[j]));
            j--;
        }
        in.close(); 
    }
}