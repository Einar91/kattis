import java.util.Scanner;
import java.util.HashMap;

class bokforing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int Q = in.nextInt(); in.nextLine();

        HashMap<Integer, Integer> D = new HashMap<>();
        int grunnbelop = 0;
        for (int i=0; i < Q; i++) {
            String[] event = in.nextLine().split(" ");
            if (event[0].equals("SET")) {
                int person = Integer.parseInt(event[1]);
                int amount = Integer.parseInt(event[2]);

                D.put(person, amount);
            }
            if (event[0].equals("RESTART")) {
                D = new HashMap<>();
                grunnbelop = Integer.parseInt(event[1]);
            }
            if (event[0].equals("PRINT")) {
                int person = Integer.parseInt(event[1]);
                if (D.containsKey(person)) {
                    System.out.println("" + (D.get(person)));
                } else {
                    System.out.println("" + grunnbelop);
                }
            }
        }

    }
}