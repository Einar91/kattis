import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pieces = {1, 1, 2, 2, 2, 8};
        for (int p : pieces) {
            int num = in.nextInt();
            System.out.println(p - num);
        }
        in.close(); 
    }
    
}
