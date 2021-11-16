import java.util.Scanner;

class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt(); in.nextLine();
        Double diag = Math.sqrt((w*w) + (h*h));

        for (int i=0; i < n; i++) {
            int match = in.nextInt();
            if (match <= diag) {
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }
        }
    }
}