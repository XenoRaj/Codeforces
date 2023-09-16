import java.util.Objects;
import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class A370 {
    static Scanner sc = new Scanner(System.in);
    public static String colorChecker(int r1, int c1) {
        if ((r1 + c1) % 2 == 0) {
            return "white";
        }
        return "black";
    }
    public static int rook(int r1, int c1, int r2, int c2) {
        if(r1==r2 || c1==c2){
            return 1;
        }
        return 2;
    }
    public static int bishop(int r1, int c1, int r2, int c2) {
        if(Objects.equals(colorChecker(r1, c1), colorChecker(r2, c2))){
            if (abs(r1-r2) == abs(c1-c2)){
                return 1;
            }
            return 2;
        }
        return 0;
    }
    public static int king(int r1, int c1, int r2, int c2){
        return max(abs(r1-r2),abs(c1-c2));
    }
    public static void main(String[] args) {
        int r1 = sc.nextInt(), c1 = sc.nextInt(), r2 = sc.nextInt(), c2 = sc.nextInt();
        System.out.print(rook(r1,c1,r2,c2)+" ");
        System.out.print(bishop(r1,c1,r2,c2)+" ");
        System.out.println(king(r1,c1,r2,c2));
    }
}
