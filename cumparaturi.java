import java.util.Scanner;

public class cumparaturi {
    public static void main(String args[]) {
        int latura;
        Scanner in = new Scanner(System.in);
        latura = in.nextInt(); in.close();
    // this is a verified formula to find a magic square's constant assuming you know the side
        latura = latura*(latura*latura+1)/2;
        System.out.printf("%d", latura);
    }
}
