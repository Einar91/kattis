import java.util.Scanner;

class SpeedLimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); in.nextLine();
        while (n != -1) {
            int lastHours = 0;
            int miles = 0;
            for (int i=0; i < n; i++) {
                int mph = in.nextInt();
                int hours = in.nextInt(); in.nextLine();

                int t = hours;
                miles = miles + (hours - lastHours) * mph;
                lastHours = t;
            }
            System.out.println(Integer.toString(miles) + " miles");
            n = in.nextInt(); in.nextLine();
        }
        in.close();
    }
}