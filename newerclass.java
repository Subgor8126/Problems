package neuepacken;
import java.util.Scanner;

//CODE WHICH ADDS LEADING ZERO TO THE BINARY STRING WHICH IS LESSER THAN THE OTHER.
//BEGINNER LEVEL

public class newerclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first binary string: ");
        String a = in.next();
        System.out.print("Enter second binary String: ");
        String b = in.next();
        if (a.length()>b.length()){
            b = leadingZero(a,b);
            System.out.println("a="+a+" b="+b);
        }
        else if(b.length()>a.length()){
            a = leadingZero(a,b);
            System.out.println("a="+a+" b="+b);
        }

    }

    static String leadingZero(String a, String b) {
        int al = a.length();
        int bl = b.length();
        String lz = "";
        int diff;
        if (al > bl) {
            diff = al - bl;
            for (int i = 0; i < diff; i++) {
                lz = lz + "0";
            }
            b = lz + b;
            return b;
        } else if (bl > al) {
            diff = bl - al;
            for (int j = 0; j < diff; j++) {
                lz = lz + "0";
            }
            a = lz + a;
            return a;
        }
        return "operation complete";

    }

}
