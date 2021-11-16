import java.util.Scanner;

class exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine()); //antall korrekte svar til fr
        String myAnswers = in.nextLine();
        String frAnswers = in.nextLine();
        int n = myAnswers.length();
        int like = 0;
        
        for (int i=0; i < n; i++) {
            if (myAnswers.charAt(i) == frAnswers.charAt(i)) {
                like++;
            }
        }

        int ulike = n - like;
        if (like == k) {
            System.out.println(Integer.toString(k + ulike));
        }
        else if (like > k) {
            System.out.println(Integer.toString(n - (like - k)));
        }
        else if (like < k) {
            System.out.println(Integer.toString(like + (ulike - k)));
        }
    }
}