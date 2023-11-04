package Days27_LoopBersarang;

public class Days27_LoopBersarang {

    public static void main(String[] args) {
        System.out.println("membuat segitiga");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (i==j) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
