import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r,alfa;
        double yayAlan, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire Yari Cap Gir..:");
        r= input.nextInt();
        System.out.print("Daire Aci Gir..:");
        alfa= input.nextInt();

        yayAlan= (pi * (r*r) * alfa) / 360;
        System.out.print(yayAlan);

    }
}
