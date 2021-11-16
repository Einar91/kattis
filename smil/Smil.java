import java.util.Scanner;

class Smil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int i = 0;
        while (i < line.length()) {
            if (line.charAt(i) == ')') {
                if (i-1 >= 0) {
                    if (line.charAt(i-1) == ':' | line.charAt(i-1) == ';') {
                        System.out.println(Integer.toString(i-1));
                    }
                    else if (i-2 >= 0 && line.charAt(i-1) == '-') {
                        if (line.charAt(i-2) == ':' | line.charAt(i-2) == ';') {
                            System.out.println(Integer.toString(i-2));
                        }
                    }
                }
            }
            i++;
        }    
        in.close();   
    }
}
