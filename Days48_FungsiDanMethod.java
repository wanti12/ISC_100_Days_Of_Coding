package Days48_FungsiDanMethod;

import java.util.Scanner;

public class Days48_FungsiDanMethod {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int x = wa.nextInt();
         hasil(x);
       
        
    }
    public static void hasil(int x)
    {
      int y;
        if (x % 2 == 0 && x != 0) {
           y = x * x;
            System.out.println(x + " x " + x + " = " + y);
        } else {
            y = x + 2;
            System.out.println(x + "+ 2 = " + y);
        }

    }

}
